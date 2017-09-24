package com.example.zhouk.footballsupporter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;
import com.example.zhouk.footballsupporter.base.BaseSearchActivity;

import static android.R.attr.button;
import static android.R.attr.longClickable;

public class ShopGoodsListActivity extends BaseSearchActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_goods_list);

        setBackBtn();
        setTitle("商品列表");

        toGoodsSearch();
        longClick();
        floatEvent();
    }

    /*搜索按钮添加事件*/
    protected void toGoodsSearch() {
        ImageView imgView = (ImageView) findViewById(R.id.img_search);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsSearchActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*float按钮添加事件*/
    protected void floatEvent(){
        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.sgl_floatBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsAddActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }


    /*cardView添加事件*/
    protected void longClick() {
        final CardView card1 = (CardView) findViewById(R.id.shl_card1);
        final CardView card2 = (CardView) findViewById(R.id.shl_card2);
        final CardView card3 = (CardView) findViewById(R.id.shl_card3);
        final CardView card4 = (CardView) findViewById(R.id.shl_card4);
        final CardView card5 = (CardView) findViewById(R.id.shl_card5);
        final CardView card6 = (CardView) findViewById(R.id.shl_card4);
        final CardView card7 = (CardView) findViewById(R.id.shl_card5);

        card1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(ShopGoodsListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该商品？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该商品成功", Toast.LENGTH_SHORT).show();
                                card1.setVisibility(View.GONE);
                               /* finish();*/
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
        card2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(ShopGoodsListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该商品？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该商品成功", Toast.LENGTH_SHORT).show();
                                card2.setVisibility(View.GONE);
                               /* finish();*/
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
        card3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(ShopGoodsListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该商品？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该商品成功", Toast.LENGTH_SHORT).show();
                                card3.setVisibility(View.GONE);
                               /* finish();*/
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
        card4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(ShopGoodsListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该商品？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该商品成功", Toast.LENGTH_SHORT).show();
                                card4.setVisibility(View.GONE);
                               /* finish();*/
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
        card5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(ShopGoodsListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该商品？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该商品成功", Toast.LENGTH_SHORT).show();
                                card5.setVisibility(View.GONE);
                               /* finish();*/
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
        card6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(ShopGoodsListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该商品？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该商品成功", Toast.LENGTH_SHORT).show();
                                card6.setVisibility(View.GONE);
                               /* finish();*/
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
        card7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(ShopGoodsListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该商品？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该商品成功", Toast.LENGTH_SHORT).show();
                                card7.setVisibility(View.GONE);
                               /* finish();*/
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

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopGoodsListActivity.this, ShopGoodsDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是OrderDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });


    }

}
