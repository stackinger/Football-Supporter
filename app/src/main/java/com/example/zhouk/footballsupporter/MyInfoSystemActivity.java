package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;


public class MyInfoSystemActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_info_system);

        setBackBtn();
        setTitle("系统设置");

        clearCache();
        feedBack();
        module();
        about();
    }

    /*清除缓存*/
    protected void clearCache(){
        View view = findViewById(R.id.mis_huancun);
        final TextView text = (TextView) findViewById(R.id.mis_huancun_value);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"清理缓存完成",Toast.LENGTH_SHORT).show();
                text.setText("0M");
            }
        });
    }

    /*意见反馈*/
    protected void feedBack(){
        //添加点击事件
        View field = (View)findViewById(R.id.mis_feedback);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(MyInfoSystemActivity.this,MyInfoFeedBackActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*夜间模式*/
    protected void module(){
        Switch switch1 = (Switch)findViewById(R.id.mis_module);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.my_info_system);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    scrollView.setBackground(getResources().getDrawable(R.drawable.dark));
                }else {
                    scrollView.setBackground(getResources().getDrawable(R.drawable.light));
                }
            }
        });
    }

    /*关于软件*/
    protected void about(){
        View view = findViewById(R.id.mis_about);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"当前软件为最新版本",Toast.LENGTH_SHORT).show();
            }
        });
    }


}
