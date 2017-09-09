package com.example.zhouk.footballsupporter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class ShopGoodsSearchActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_goods_search);
        final CardView card = (CardView) findViewById(R.id.sgs_card);

        setTitle("搜索");
        setBackBtn();
        jump();
        longClick();

        SearchView searchView = (SearchView) findViewById(R.id.sgs_searchview);
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

    /*查询出来的cardview跳转*/
    protected void jump(){
        CardView card = (CardView) findViewById(R.id.sgs_card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsSearchActivity.this, ShopGoodsDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是CircleSearchActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*长按事件*/
    protected void longClick(){
        CardView card = (CardView) findViewById(R.id.sgs_card);
        card.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(ShopGoodsSearchActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该商品？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除商品成功", Toast.LENGTH_SHORT).show();
                                finish();
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
