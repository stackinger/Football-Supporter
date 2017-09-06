package com.example.zhouk.footballsupporter;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.example.zhouk.footballsupporter.base.BaseActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FieldMapActivity extends BaseActivity implements LocationSource,AMapLocationListener{
    MapView mMapView = null;
    AMap aMap;
    private UiSettings mUiSettings;//定义一个UiSettings对象
    private AMapLocationClient mLocationClient = null;
    public AMapLocationClientOption mLocationOption = null;
    private OnLocationChangedListener mListener = null;
    private boolean isFirstLoc = true;
    private final int requestCode = 1500;
    private TextView mPriceTv;
    private TextView mScaleTv;
    private TextView mLawnTv;
    private Button mConfirmBtn;
    private CardView mDetailCv;
    private EditText mPeopleEt;
    private FloatingActionButton mFieldListFab;

    /**
     * 需要进行检测的权限数组
     */
    protected String[] needPermissions = {
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.READ_PHONE_STATE
    };

    private static final int PERMISSON_REQUESTCODE = 0;

    /**
     * 判断是否需要检测，防止不停的弹框
     */
    private boolean isNeedCheck = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_map);
        //定义了一个地图view
        mDetailCv = (CardView)findViewById(R.id.field_detail);
        mMapView = (MapView) findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);// 此方法须覆写，虚拟机需要在很多情况下保存地图绘制的当前状态。
        //设置状态标题
        setTitle("球场管理");
        setBackBtn();
        init();
    }
    /*
    * 初始化地图
    * */
    protected void init(){
        //初始化地图
        if (aMap == null) {
            aMap = mMapView.getMap();
            showControl();
        }
        //高德地图定位，添加标注
        location();
        addMarker();
        //设置球场详细显示样式
        textStyle();
        //为确定按钮添加事件
        confirm();
        //为FloatingActionButton添加事件
        FieldList();
    }

    /*
    * FloatingActionButton添加事件，跳转到足球场列表页面
    * */
    protected void FieldList(){
        mFieldListFab = (FloatingActionButton) findViewById(R.id.field_list);
        mFieldListFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(FieldMapActivity.this, FieldListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*
    * 场地详细cardview上的确定按钮
    * */
    protected void confirm(){
        mConfirmBtn = (Button)findViewById(R.id.confirm);
        mConfirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "修改球场人数成功", Toast.LENGTH_SHORT).show();

                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                mDetailCv.setVisibility(View.INVISIBLE);
            }
        });
    }

    /*
    * 设置TextView的显示样式
    * */
    protected void textStyle(){
        mPriceTv = (TextView) findViewById(R.id.price_tv);
        mScaleTv = (TextView) findViewById(R.id.scale_tv);
        mLawnTv = (TextView) findViewById(R.id.lawn_tv);
        //单价样式
        SpannableString priceText = new SpannableString("10.0元");
        priceText.setSpan(new TextAppearanceSpan(this, R.style.BigGreenText), 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        priceText.setSpan(new TextAppearanceSpan(this, R.style.LittleGreenText), 4, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mPriceTv.setText(priceText, TextView.BufferType.SPANNABLE);
        //规模(11人制)样式
        SpannableString scaleText = new SpannableString("11人制");
        scaleText.setSpan(new TextAppearanceSpan(this, R.style.BigGreenText), 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        scaleText.setSpan(new TextAppearanceSpan(this, R.style.LittleGreenText), 2, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mScaleTv.setText(scaleText, TextView.BufferType.SPANNABLE);
        //草坪类型样式
        SpannableString lawnText = new SpannableString("天然草坪");
        lawnText.setSpan(new TextAppearanceSpan(this, R.style.BigGreenText), 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        lawnText.setSpan(new TextAppearanceSpan(this, R.style.LittleGreenText), 2, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mLawnTv.setText(lawnText, TextView.BufferType.SPANNABLE);
    }

    /*
    *显示地图控件
    * */
    protected void showControl(){
        mUiSettings = aMap.getUiSettings();//实例化UiSettings类对象
        mUiSettings.setZoomControlsEnabled(true);//显示地图缩放按钮
        mUiSettings.setCompassEnabled(true);//显示指南针
        mUiSettings.setScaleControlsEnabled(true);//显示比例尺
        aMap.setLocationSource(this);
        mUiSettings.setMyLocationButtonEnabled(true);
        aMap.setMyLocationEnabled(true);
        aMap.moveCamera(CameraUpdateFactory.zoomTo(14));
    }

    /*
    * 定位
    * */
    private void location() {
        mLocationClient = new AMapLocationClient(getApplicationContext());
        mLocationClient.setLocationListener(this);
        mLocationOption = new AMapLocationClientOption();
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        mLocationOption.setNeedAddress(true);
        mLocationOption.setOnceLocation(false);
        mLocationOption.setWifiActiveScan(true);
        mLocationOption.setMockEnable(false);
        mLocationOption.setInterval(2000);
        mLocationClient.setLocationOption(mLocationOption);
        mLocationClient.startLocation();
    }

    /*
    * 添加足球场marker
    * */
    protected  void addMarker(){
        //主体育场11人场
        LatLng latLng = new LatLng(30.764517,103.98165);
        final Marker marker = aMap.addMarker(new MarkerOptions().position(latLng));
        //5人足球场
        LatLng latLng1 = new LatLng(30.762231,103.992271);
        final Marker marker1 = aMap.addMarker(new MarkerOptions().position(latLng1));
        //5人足球场
        LatLng latLng2 = new LatLng(30.762286,103.992915);
        final Marker marker2 = aMap.addMarker(new MarkerOptions().position(latLng2));
        //5人足球场
        LatLng latLng3 = new LatLng(30.762286,103.993537);
        final Marker marker3 = aMap.addMarker(new MarkerOptions().position(latLng3));
        //5人足球场
        LatLng latLng4 = new LatLng(30.761881,103.992593);
        final Marker marker4 = aMap.addMarker(new MarkerOptions().position(latLng4));
        // 定义 Marker 点击事件监听
        AMap.OnMarkerClickListener markerClickListener = new AMap.OnMarkerClickListener() {
            // marker 对象被点击时回调的接口
            // 返回 true 则表示接口已响应事件，否则返回false
            @Override
            public boolean onMarkerClick(Marker marker) {
                /*Toast.makeText(getApplicationContext(), "11人场次", Toast.LENGTH_SHORT).show();*/
                mDetailCv.setVisibility(View.VISIBLE);
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.RESULT_SHOWN);
                mPeopleEt = (EditText)findViewById(R.id.people);
                mPeopleEt.setInputType(EditorInfo.TYPE_CLASS_PHONE);
                return false;
            }
        };
        // 绑定 Marker 被点击事件
        aMap.setOnMarkerClickListener(markerClickListener);
        //绑定顶图点击事件
        aMap.setOnMapClickListener(new AMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                /*InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);*/
                mDetailCv.setVisibility(View.INVISIBLE);
            }
        });
    }

    /*详细信息添加点击事件*/
    protected void toEditField(){
        TextView textView = (TextView)findViewById(R.id.fm_detail);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FieldMapActivity.this, EditFieldActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是FieldMapActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
        mMapView.onDestroy();
        mLocationClient.stopLocation();
        mLocationClient.onDestroy();
    }
    @Override
    protected void onResume() {
        super.onResume();
        /*检查权限*/
        if(isNeedCheck){
            checkPermissions(needPermissions);
        }
        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
        mMapView.onResume();
    }

    private void checkPermissions(String... permissions) {
        List<String> needRequestPermissonList = findDeniedPermissions(permissions);
        if (null != needRequestPermissonList
                && needRequestPermissonList.size() > 0) {
            ActivityCompat.requestPermissions(this,
                    needRequestPermissonList.toArray(
                            new String[needRequestPermissonList.size()]),
                    PERMISSON_REQUESTCODE);
        }
    }

    /**
     * 获取权限集中需要申请权限的列表
     *
     * @param permissions
     * @return
     * @since 2.5.0
     *
     */
    private List<String> findDeniedPermissions(String[] permissions) {
        List<String> needRequestPermissonList = new ArrayList<String>();
        for (String perm : permissions) {
            if (ContextCompat.checkSelfPermission(this,
                    perm) != PackageManager.PERMISSION_GRANTED
                    || ActivityCompat.shouldShowRequestPermissionRationale(
                    this, perm)) {
                needRequestPermissonList.add(perm);
            }
        }
        return needRequestPermissonList;
    }

    /**
     * 检测是否说有的权限都已经授权
     * @param grantResults
     * @return
     * @since 2.5.0
     *
     */
    private boolean verifyPermissions(int[] grantResults) {
        for (int result : grantResults) {
            if (result != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] paramArrayOfInt) {
        /*super.onRequestPermissionsResult(requestCode, permissions, grantResults);*/
        if (requestCode == PERMISSON_REQUESTCODE) {
            if (!verifyPermissions(paramArrayOfInt)) {
                showMissingPermissionDialog();
                isNeedCheck = false;
            }
        }
    }

    /**
     * 显示提示信息
     *
     * @since 2.5.0
     *
     */
    private void showMissingPermissionDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.notifyTitle);
        builder.setMessage(R.string.notifyMsg);

        // 拒绝, 退出应用
        builder.setNegativeButton(R.string.cancel,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

        builder.setPositiveButton(R.string.setting,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startAppSettings();
                    }
                });

        builder.setCancelable(false);

        builder.show();
    }

    /**
     *  启动应用的设置
     *
     * @since 2.5.0
     *
     */
    private void startAppSettings() {
        Intent intent = new Intent(
                Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
        mMapView.onPause();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
        mMapView.onSaveInstanceState(outState);
    }

    @Override
    public void activate(OnLocationChangedListener onLocationChangedListener) {
        mListener = onLocationChangedListener;
    }

    @Override
    public void deactivate() {
        mListener = null;

    }

    @Override
    public void onLocationChanged(AMapLocation aMapLocation) {
        if (aMapLocation != null) {
            if (aMapLocation.getErrorCode() == 0) {
                aMapLocation.getLocationType();
                aMapLocation.getLatitude();
                aMapLocation.getLongitude();
                aMapLocation.getAccuracy();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date(aMapLocation.getTime());
                df.format(date);
                aMapLocation.getAddress();
                aMapLocation.getCountry();
                aMapLocation.getProvince();
                aMapLocation.getCity();
                aMapLocation.getDistrict();
                aMapLocation.getStreet();
                aMapLocation.getStreetNum();
                aMapLocation.getCityCode();
                aMapLocation.getAdCode();

                if (isFirstLoc) {
                    aMap.moveCamera(CameraUpdateFactory.zoomTo(17));
                    aMap.moveCamera(CameraUpdateFactory.changeLatLng(new LatLng(aMapLocation.getLatitude(), aMapLocation.getLongitude())));
                    mListener.onLocationChanged(aMapLocation);
                    StringBuffer buffer = new StringBuffer();
                    buffer.append(aMapLocation.getCountry() + ""
                            + aMapLocation.getProvince() + ""
                            + aMapLocation.getCity() + ""
                            + aMapLocation.getProvince() + ""
                            + aMapLocation.getDistrict() + ""
                            + aMapLocation.getStreet() + ""
                            + aMapLocation.getStreetNum());
                    Toast.makeText(getApplicationContext(), buffer.toString(), Toast.LENGTH_SHORT).show();
                    isFirstLoc = false;
                }


            } else {
                Log.e("XXXXXXAmapError", "location Error, ErrCode:"
                        + aMapLocation.getErrorCode() + ", errInfo:"
                        + aMapLocation.getErrorInfo());
                Toast.makeText(getApplicationContext(), "定位失败", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
