package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class MyInfoActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_info);

        setBackBtn();
        setTitle("我的信息");

        toBirth();
        toName();
        toSex();
    }

    /*生日选择*/
    protected void toBirth(){
        //添加点击事件
        View field = (View)findViewById(R.id.mi_birth);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(MyInfoActivity.this,MyInfoBirthActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*昵称选择*/
    protected void toName(){
        //添加点击事件
        View field = (View)findViewById(R.id.mi_name);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(MyInfoActivity.this,MyInfoNameActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*性别*/
    protected void toSex(){
        //添加点击事件
        View field = (View)findViewById(R.id.mi_sex);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(MyInfoActivity.this,MyInfoSexActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

}
