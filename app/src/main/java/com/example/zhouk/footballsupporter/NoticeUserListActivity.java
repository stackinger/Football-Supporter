package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ImageView;

import com.example.zhouk.footballsupporter.base.BaseSearchActivity;

public class NoticeUserListActivity extends BaseSearchActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_user_list);

        setTitle("用户通知列表");
        setBackBtn();

        ToNoticeUserSearch();
        add();
    }

    /*LinearLayout添加长按事件*/
    protected void viewEvent(){
        View view1 = findViewById(R.id.ul_view1);
        View view2 = findViewById(R.id.ul_view2);
        View view3 = findViewById(R.id.ul_view3);
        View view4 = findViewById(R.id.ul_view4);
        View view5 = findViewById(R.id.ul_view5);


        //点击事件
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeUserListActivity.this,UserDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是UserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeUserListActivity.this,UserDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是UserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeUserListActivity.this,UserDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是UserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeUserListActivity.this,UserDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是UserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeUserListActivity.this,UserDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是UserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*搜索按钮添加事件*/
    protected void ToNoticeUserSearch() {
        ImageView imgView = (ImageView) findViewById(R.id.img_search);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeUserListActivity.this, NoticeUserListSearchActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是UserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*添加按钮跳转*/
    protected void add(){
        FloatingActionButton fBtn = (FloatingActionButton) findViewById(R.id.nul_fBtn);
        fBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeUserListActivity.this, NoticeUserDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是UserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }
}
