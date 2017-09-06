package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class OrderTuiKuanQuXiaoActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_tuikuan_quxiao);

        setTitle("取消订单并退款");
        setBackBtn();

        ToOrderList();
    }

    /*搜索按钮添加事件*/
    protected void ToOrderList() {
        Button button = (Button) findViewById(R.id.otq_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(OrderTuiKuanQuXiaoActivity.this, OrderSearchActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);*/
                finish();
            }
        });
    }

}
