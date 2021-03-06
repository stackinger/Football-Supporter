package com.example.zhouk.footballsupporter;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.FileNotFoundException;

public class NoticeUserDetailActivity extends BaseActivity {
    private final int requestCode = 1500;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_user_detail);

        setTitle("通知详细");
        setBackBtn();

        toNoticeList();
    }

    /*确定按钮跳转到添加成功*/
    protected void toNoticeList() {
        Button button = (Button) findViewById(R.id.nud_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"消息推送成功", Toast.LENGTH_SHORT).show();

                finish();
                /*Intent intent = new Intent(NoticeUserDetailActivity.this, NewsListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NewsDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);*/
            }
        });
    }

}
