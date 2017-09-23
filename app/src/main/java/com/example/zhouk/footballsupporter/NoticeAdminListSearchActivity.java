package com.example.zhouk.footballsupporter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class NoticeAdminListSearchActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_admin_list_search);
        final View card =  findViewById(R.id.nals_card);

        setTitle("搜索");
        setBackBtn();

        SearchView searchView = (SearchView) findViewById(R.id.nals_searchview);
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
        final View card = findViewById(R.id.nals_card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeAdminListSearchActivity.this, NoticeUserDetailNotNullActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NewsSearchActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

        card.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeAdminListSearchActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                card.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
                               /* finish();*/
                            }
                        }).setNegativeButton("返回",new DialogInterface.OnClickListener() {//添加返回按钮
                    @Override
                    public void onClick(DialogInterface dialog, int which) {//响应事件
                        // TODO Auto-generated method stub
                        /*Log.i("alertdialog"," 请保存数据！");*/
                    }
                }).show();//在按键响应事件中显示此对话框
                return false;
            }
        });
    }

}
