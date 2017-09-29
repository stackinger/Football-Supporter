package com.example.zhouk.footballsupporter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;


public class MyInfoFeedBackActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_info_feedback);

        setBackBtn();
        setTitle("意见反馈");

        toMyInfo();
    }

    protected void toMyInfo(){
        Button button = (Button) findViewById(R.id.mif_confirm);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"提交意见反馈成功",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
