package com.example.zhouk.footballsupporter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyRegisterActivity extends Activity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_register);

        View field = (View)findViewById(R.id.zhuce_yanzhengma);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "验证码已发送", Toast.LENGTH_SHORT).show();
            }
        });

        View field1 = (View)findViewById(R.id.zc_zhuce_btn);
        field1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "用户注册成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MyRegisterActivity.this,LoginActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是Forget传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }
}
