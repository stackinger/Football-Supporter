package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.CardView;
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
        addCardEvent();
        ToOrderSearch();
        AddButtonEvent();
    }

    /*搜索按钮添加事件*/
    protected void ToOrderSearch() {
        ImageView imgView = (ImageView) findViewById(R.id.img_search);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderSearchActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是ShopOrderListActivity传过来的值！");
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
        tabLayout.addTab(tabLayout.newTab().setText("待发货"));
        tabLayout.addTab(tabLayout.newTab().setText("待收货"));
        tabLayout.addTab(tabLayout.newTab().setText("待评价"));
        tabLayout.addTab(tabLayout.newTab().setText("退款/售后"));
    }

    /*添加按钮事件*/
    protected void AddButtonEvent() {
        Button chakan = (Button) findViewById(R.id.sol_chakan);
        Button quxiao1 = (Button) findViewById(R.id.sol_quxiao1);
        Button fahuo = (Button) findViewById(R.id.sol_fahuo);
        Button quxiao2 = (Button) findViewById(R.id.sol_quxiao2);
        Button chakan2 = (Button) findViewById(R.id.sol_chakan2);
        Button tuikuan = (Button) findViewById(R.id.sol_tuikuan_shouhou);

        chakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        quxiao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderQuXiaoActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        fahuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderFaHuoActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        quxiao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderTuiKuanQuXiaoActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        chakan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderDetailActivity.class);
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
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderTuiKuanActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*添加cardVIew点击事件*/
    protected void addCardEvent() {
        CardView card1 = (CardView) findViewById(R.id.sol_card1);
        CardView card2 = (CardView) findViewById(R.id.sol_card2);
        CardView card3 = (CardView) findViewById(R.id.sol_card3);
        CardView card4 = (CardView) findViewById(R.id.sol_card4);
        CardView card5 = (CardView) findViewById(R.id.sol_card5);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是ShopOrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是ShopOrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是ShopOrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是ShopOrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopOrderListActivity.this, ShopOrderDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是ShopOrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

}
