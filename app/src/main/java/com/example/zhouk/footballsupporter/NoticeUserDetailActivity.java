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

        setTitle("新闻详细");
        setBackBtn();

    }

    /*确定按钮跳转到添加成功*/
    protected void ToNewList() {
        Button button = (Button) findViewById(R.id.nd_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"新闻添加成功", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(NoticeUserDetailActivity.this, NewsListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NewsDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*操作段落按钮*/
    protected void paragraph(){
        /*添加段落*/
        Button button = (Button) findViewById(R.id.nd_addBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView cardView = (CardView) findViewById(R.id.nd_card2);
                cardView.setVisibility(View.VISIBLE);
            }
        });
        /*删除段落一*/
        Button delBtn1 = (Button) findViewById(R.id.nd_delBtn01);
        delBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView cardView = (CardView) findViewById(R.id.nd_card1);
                cardView.setVisibility(View.GONE);
            }
        });
        /*删除段落二*/
        Button delBtn2 = (Button) findViewById(R.id.nd_delBtn02);
        delBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView cardView = (CardView) findViewById(R.id.nd_card2);
                cardView.setVisibility(View.GONE);
            }
        });

    }
}
