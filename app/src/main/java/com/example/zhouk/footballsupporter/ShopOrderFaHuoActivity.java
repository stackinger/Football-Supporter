package com.example.zhouk.footballsupporter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class ShopOrderFaHuoActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_order_fahuo);

        setTitle("填写发货信息");
        setBackBtn();

        ToOrderList();

    }

    /*搜索按钮添加事件*/
    protected void ToOrderList() {
        Button button = (Button) findViewById(R.id.sof_fahuo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"已发货",Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(OrderQuXiaoActivity.this, OrderListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderQuXiaoActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);*/
                finish();
            }
        });
    }

}
