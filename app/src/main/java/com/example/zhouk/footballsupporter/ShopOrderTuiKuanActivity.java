package com.example.zhouk.footballsupporter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class ShopOrderTuiKuanActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_order_tuikuan);

        setTitle("退款");
        setBackBtn();

        ToOrderList();
    }

    /*搜索按钮添加事件*/
    protected void ToOrderList() {
        Button button = (Button) findViewById(R.id.sot_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"退款成功",Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(OrderTuiKuanActivity.this, OrderListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderTuiKuanActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);*/
                finish();
            }
        });
    }

}
