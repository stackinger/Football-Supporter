package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class ShopOrderDetailActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_order_detail);

        setTitle("商品订单详细");
        setBackBtn();
    }

    /*确定按钮事件*/
    protected void toList(){
        Button button = (Button) findViewById(R.id.sgd_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"修改商品信息成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ShopOrderDetailActivity.this, ShopGoodsListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }


}
