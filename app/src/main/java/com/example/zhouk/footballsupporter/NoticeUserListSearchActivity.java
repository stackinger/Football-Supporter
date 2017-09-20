package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SearchView;
import android.view.View;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class NoticeUserListSearchActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_user_list_search);
        final View card =  findViewById(R.id.nuls_card);

        setTitle("搜索");
        setBackBtn();

        SearchView searchView = (SearchView) findViewById(R.id.nuls_searchview);
        //设置搜索框直接展开显示。左侧有放大镜(在搜索框中) 右侧有叉叉 可以关闭搜索框
        searchView.setIconified(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                card.setVisibility(View.VISIBLE);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                card.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        viewEvent();
    }

    /*查询结果添加事件*/
    protected void viewEvent(){
        View card = findViewById(R.id.nuls_card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeUserListSearchActivity.this, NoticeUserDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NewsSearchActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

}
