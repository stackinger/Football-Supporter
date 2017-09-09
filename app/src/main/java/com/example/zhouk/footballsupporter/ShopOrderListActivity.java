package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.zhouk.footballsupporter.base.BaseSearchActivity;

public class ShopOrderListActivity extends BaseSearchActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_order_list);

        setTitle("商品订单列表");
        setBackBtn();

        addTabTitle();
    }

    /*搜索按钮添加事件*/
    protected void ToOrderSearch() {
        ImageView imgView = (ImageView) findViewById(R.id.img_search);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderSearchActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*Tablayout添加标题*/
    protected void addTabTitle() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sol_tab);
        tabLayout.addTab(tabLayout.newTab().setText("全部"));
        tabLayout.addTab(tabLayout.newTab().setText("待付款"));
        tabLayout.addTab(tabLayout.newTab().setText("待消费"));
        tabLayout.addTab(tabLayout.newTab().setText("已完成"));
        tabLayout.addTab(tabLayout.newTab().setText("待退款"));
    }

    /*添加按钮事件*/
    protected void AddButtonEvent() {
        Button pingJiaBtn = (Button) findViewById(R.id.ol_pingjia);
        Button quxiao1 = (Button) findViewById(R.id.ol_quxiao1);
        Button quxiao2 = (Button) findViewById(R.id.ol_quxiao2);
        Button tuikuan = (Button) findViewById(R.id.ol_tuikuan);
        pingJiaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderPingJiaActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        quxiao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderQuXiaoActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        quxiao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderTuiKuanQuXiaoActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        tuikuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderTuiKuanActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*添加按钮事件*/
    protected void AddEvent() {
        View liner1 = findViewById(R.id.ol_linear1);
        View liner2 = findViewById(R.id.ol_linear2);
        View liner3 = findViewById(R.id.ol_linear3);
        View liner4 = findViewById(R.id.ol_linear4);
        liner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        liner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        liner3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        liner4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, OrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

}
