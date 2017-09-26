package com.example.zhouk.footballsupporter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;


public class MyInfoNameActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_info_name);

        setBackBtn();
        setTitle("修改昵称");

        toMyInfo();
    }

    protected void toMyInfo(){
        Button button = (Button) findViewById(R.id.min_confirm);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"修改昵称成功",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
