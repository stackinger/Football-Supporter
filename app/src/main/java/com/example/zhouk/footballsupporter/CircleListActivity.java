package com.example.zhouk.footballsupporter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseSearchActivity;

public class CircleListActivity extends BaseSearchActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_list);

        setTitle("圈子列表");
        setBackBtn();

        longClick();
        ToCircleSearch();
    }

    /*cardview添加长按事件*/
    protected void longClick(){
        final CardView card1 = (CardView) findViewById(R.id.cl_card1);
        final CardView card2 = (CardView) findViewById(R.id.cl_card2);
        final CardView card3 = (CardView) findViewById(R.id.cl_card3);
        final CardView card4 = (CardView) findViewById(R.id.cl_card4);
        final CardView card5 = (CardView) findViewById(R.id.cl_card5);
        card1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(CircleListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条圈子？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该条圈子成功", Toast.LENGTH_SHORT).show();
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
                new AlertDialog.Builder(CircleListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条圈子？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该条圈子成功", Toast.LENGTH_SHORT).show();
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
                new AlertDialog.Builder(CircleListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条圈子？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该条圈子成功", Toast.LENGTH_SHORT).show();
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
                new AlertDialog.Builder(CircleListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条圈子？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该条圈子成功", Toast.LENGTH_SHORT).show();
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
                new AlertDialog.Builder(CircleListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条圈子？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该条圈子成功", Toast.LENGTH_SHORT).show();
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

        //点击事件
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CircleListActivity.this,CircleDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是CircleListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CircleListActivity.this,CircleDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是CircleListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CircleListActivity.this,CircleDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是CircleListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CircleListActivity.this,CircleDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是CircleListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CircleListActivity.this,CircleDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是CircleListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*搜索按钮添加事件*/
    protected void ToCircleSearch() {
        ImageView imgView = (ImageView) findViewById(R.id.img_search);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CircleListActivity.this, CircleSearchActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是CircleListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }
}
