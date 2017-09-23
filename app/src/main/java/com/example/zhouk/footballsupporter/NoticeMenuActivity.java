package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class NoticeMenuActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_menu);

        setBackBtn();
        setTitle("通知管理");

        userNoticeList();
        adminNoticeList();
    }

    /*用户通知跳转*/
    protected void userNoticeList(){
        //添加点击事件
        View field = (View)findViewById(R.id.nm_user);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(NoticeMenuActivity.this,NoticeUserListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*管理员通知跳转*/
    protected void adminNoticeList(){
        //添加点击事件
        View field = (View)findViewById(R.id.nm_admin);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(NoticeMenuActivity.this,NoticeAdminListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

}
