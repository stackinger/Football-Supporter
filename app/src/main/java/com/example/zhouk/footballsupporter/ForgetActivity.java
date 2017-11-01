package com.example.zhouk.footballsupporter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class ForgetActivity extends Activity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget);

        toLogin();
        yanZheng();
    }

    /*q确认修改密码*/
    protected void toLogin(){
        //添加点击事件
        View field = (View)findViewById(R.id.forget_btn);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "修改密码成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ForgetActivity.this,LoginActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是Forget传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*发送验证码*/
    protected void yanZheng(){
        //添加点击事件
        View field = (View)findViewById(R.id.yanzhengma_btn);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "验证码已发送", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
