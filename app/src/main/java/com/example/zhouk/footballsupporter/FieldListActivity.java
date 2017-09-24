package com.example.zhouk.footballsupporter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;

public class FieldListActivity extends BaseActivity{
    private FloatingActionButton floatButton;
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_list);

        setTitle("足球场列表");
        setBackBtn();

        ToChooseMarker();
        cardLongClick();
        ToEditField();
    }

    /*
    * FLoatingActionButton添加事件，跳转到选择足球地点页面
    * */
    protected void ToChooseMarker(){
        floatButton = (FloatingActionButton) findViewById(R.id.float_action_button);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(FieldListActivity.this, ChooseMarkerActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

    }

    /*为cardview添加事件*/
    protected void cardLongClick(){
        final CardView cardView1 = (CardView)findViewById(R.id.fl_card1);
        cardView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(FieldListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该球场！")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该球场成功", Toast.LENGTH_SHORT).show();
                                cardView1.setVisibility(View.GONE);
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

        final CardView cardView2 = (CardView)findViewById(R.id.fl_card2);
        cardView2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(FieldListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该球场！")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该球场成功", Toast.LENGTH_SHORT).show();
                                cardView2.setVisibility(View.GONE);
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

        final CardView cardView3 = (CardView)findViewById(R.id.fl_card3);
        cardView3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(FieldListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该球场！")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该球场成功", Toast.LENGTH_SHORT).show();
                                cardView3.setVisibility(View.GONE);
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

        final CardView cardView4 = (CardView)findViewById(R.id.fl_card4);
        cardView4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(FieldListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该球场！")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该球场成功", Toast.LENGTH_SHORT).show();
                                cardView4.setVisibility(View.GONE);
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

        final CardView cardView5 = (CardView)findViewById(R.id.fl_card5);
        cardView5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(FieldListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该球场！")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(),"删除该球场成功", Toast.LENGTH_SHORT).show();
                                cardView5.setVisibility(View.GONE);
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
    }

    /*cardView跳转到EditField界面*/
    protected void ToEditField(){
        CardView cardView1 = (CardView)findViewById(R.id.fl_card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FieldListActivity.this, EditFieldActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是FieldListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

        CardView cardView2 = (CardView)findViewById(R.id.fl_card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FieldListActivity.this, EditFieldActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是FieldListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

        CardView cardView3 = (CardView)findViewById(R.id.fl_card3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FieldListActivity.this, EditFieldActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是FieldListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

        CardView cardView4 = (CardView)findViewById(R.id.fl_card4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FieldListActivity.this, EditFieldActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是FieldListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

        CardView cardView5 = (CardView)findViewById(R.id.fl_card5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FieldListActivity.this, EditFieldActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是FieldListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

    }


}
