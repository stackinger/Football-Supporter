package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class AdminSearchActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_search);
        final View view =  findViewById(R.id.as_view);

        setTitle("搜索管理员");
        setBackBtn();

        SearchView searchView = (SearchView) findViewById(R.id.as_searchview);
        //设置搜索框直接展开显示。左侧有放大镜(在搜索框中) 右侧有叉叉 可以关闭搜索框
        searchView.setIconified(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                view.setVisibility(View.VISIBLE);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                view.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        viewEvent();
    }

    /*view添加跳转事件*/
    protected void viewEvent(){
        View view =  findViewById(R.id.as_view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminSearchActivity.this, AdminDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是UserSearchActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

}
