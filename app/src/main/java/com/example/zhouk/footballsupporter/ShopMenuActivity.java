package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.zhouk.footballsupporter.base.BaseActivity;
import com.example.zhouk.footballsupporter.base.BaseNoBackActivity;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

public class ShopMenuActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_menu);

        setBackBtn();
        setTitle("商城管理");

        goodsList();
        orderList();
    }

    /*商品管理跳转*/
    protected void goodsList(){
        //添加点击事件
        View field = (View)findViewById(R.id.sm_goods);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(ShopMenuActivity.this,ShopGoodsListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*商品管理跳转*/
    protected void orderList(){
        //添加点击事件
        View field = (View)findViewById(R.id.sm_order);
        field.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(ShopMenuActivity.this,ShopOrderListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

}
