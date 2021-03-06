package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.zhouk.footballsupporter.base.BaseActivity;
import com.example.zhouk.footballsupporter.base.BaseSearchActivity;

public class OrderDetailActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_detail);

        setTitle("订单详细");
        setBackBtn();

        ToOrderPingJia();

    }

    /*按钮添加事件*/
    protected void ToOrderPingJia() {
        Button button = (Button) findViewById(R.id.od_pingjia);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderDetailActivity.this, OrderPingJiaActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }
}
