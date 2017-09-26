package com.example.zhouk.footballsupporter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;


public class MyInfoSexActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_info_sex);

        setBackBtn();
        setTitle("修改性别");

        toMyInfo();
    }

    protected void toMyInfo(){
        Button button = (Button) findViewById(R.id.mis_confirm);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"修改性别成功",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}
