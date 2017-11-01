package com.example.zhouk.footballsupporter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class LoginActivity extends Activity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        toMain();
        forget();
        zhuce();
    }

    /*登录*/
    protected void toMain(){
        //添加点击事件
        View field = (View)findViewById(R.id.login_btn);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是Login传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*忘记密码*/
    protected void forget(){
        //添加点击事件
        View field = (View)findViewById(R.id.forget);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(LoginActivity.this,ForgetActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是Login传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*注册*/
    protected void zhuce(){
        //添加点击事件
        View field = (View)findViewById(R.id.register_txt);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(LoginActivity.this,MyRegisterActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是Login传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

}
