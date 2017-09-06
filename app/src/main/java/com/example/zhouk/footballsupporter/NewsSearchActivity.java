package com.example.zhouk.footballsupporter;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SearchView;
import android.view.View;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class NewsSearchActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_search);
        final CardView card = (CardView) findViewById(R.id.ns_card);

        setTitle("搜索");
        setBackBtn();

        SearchView searchView = (SearchView) findViewById(R.id.ns_searchview);
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
    }

}
