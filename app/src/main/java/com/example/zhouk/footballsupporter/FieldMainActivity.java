package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.zhouk.footballsupporter.base.BaseNoBackActivity;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;
import com.readystatesoftware.viewbadger.BadgeView;

public class FieldMainActivity extends BaseNoBackActivity {
    private RollPagerView mRollViewPager;
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_activity_main);
        mRollViewPager = (RollPagerView) findViewById(R.id.field_roll_view_pager);

        //设置播放时间间隔
        mRollViewPager.setPlayDelay(1000);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new TestNormalAdapter());

        //设置指示器（顺序依次）
        //自定义指示器图片
        //设置圆点指示器颜色
        //设置文字指示器
        //隐藏指示器
        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));
        mRollViewPager.setHintView(new ColorPointHintView(this, Color.YELLOW,Color.WHITE));
        //mRollViewPager.setHintView(new TextHintView(this));
        //mRollViewPager.setHintView(null);

        setTitle("高校足球运动后台管理系统");

        FieldManagement();
        MyInfoManagement();
        jiaobiao();
        tongzhi();
    }

    /*球场管理点击事件*/
    protected void FieldManagement(){
        //添加点击事件
        View field = (View)findViewById(R.id.field_field);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(FieldMainActivity.this,FieldMapActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*我的信息点击事件*/
    protected void MyInfoManagement(){
        View shopField = (View)findViewById(R.id.field_myinfo);
        shopField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FieldMainActivity.this,MyInfoActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*通知图标*/
    protected void tongzhi(){
        View shopField = (View)findViewById(R.id.img_back_no);
        shopField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FieldMainActivity.this,NoticeListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*为通知图标添加角标*/
    protected void jiaobiao(){
        ImageView img = (ImageView) findViewById(R.id.img_back_no);
        BadgeView badgeView=new BadgeView(this, img);
        badgeView.setText("1");
        badgeView.setTextColor(Color.WHITE);
        badgeView.setBadgePosition(BadgeView.POSITION_TOP_RIGHT);
        badgeView.setAlpha(1f);
        badgeView.setBadgeMargin(0,0);
        //badgeView.setAnimation(alphaAnimation);
        badgeView.show();
    }


    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.drawable.mainheader,
                R.drawable.mainheader,
                R.drawable.mainheader,
                R.drawable.mainheader,
        };


        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }


        @Override
        public int getCount() {
            return imgs.length;
        }
    }
}
