package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.zhouk.footballsupporter.base.BaseActivity;
import com.google.android.gms.common.api.GoogleApiClient;

public class OrderPingJiaActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_pingjia);

        setTitle("查看评价");
        setBackBtn();

        ToOrderList();
    }

    /*返回按钮添加事件*/
    protected void ToOrderList() {
        Button button = (Button) findViewById(R.id.op_return);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(OrderPingJiaActivity.this, OrderListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderPingjiaActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);*/
                finish();
            }
        });
    }

    /*Tablayout添加标题*/
    protected void addTabTitle() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.ol_tab);
        tabLayout.addTab(tabLayout.newTab().setText("全部"));
        tabLayout.addTab(tabLayout.newTab().setText("待付款"));
        tabLayout.addTab(tabLayout.newTab().setText("待消费"));
        tabLayout.addTab(tabLayout.newTab().setText("已完成"));
        tabLayout.addTab(tabLayout.newTab().setText("待退款"));
    }

}
