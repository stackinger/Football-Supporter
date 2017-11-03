package com.example.zhouk.footballsupporter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;
import com.example.zhouk.footballsupporter.base.BaseSearchActivity;

public class NoticeListActivity extends BaseActivity {
    private final int requestCode = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_list);

        setTitle("通知");
        setBackBtn();

        viewEvent();
    }

    /*LinearLayout添加事件*/
    protected void viewEvent(){
        final View view1 = findViewById(R.id.n_linear1);
        final View view2 = findViewById(R.id.n_linear2);
        final View view3 = findViewById(R.id.n_linear3);
        final View view4 = findViewById(R.id.n_linear4);
        final View view5 = findViewById(R.id.n_linear5);
        final View view6 = findViewById(R.id.n_linear6);
        final View view7 = findViewById(R.id.n_linear7);
        final View view8 = findViewById(R.id.n_linear8);

        //点击事件
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeListActivity.this,NoticeDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NoticeUserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeListActivity.this,NoticeDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NoticeUserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeListActivity.this,NoticeDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NoticeUserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeListActivity.this,NoticeDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NoticeUserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeListActivity.this,NoticeDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NoticeUserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeListActivity.this,NoticeDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NoticeUserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeListActivity.this,NoticeDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NoticeUserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
        view8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeListActivity.this,NoticeDetailActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NoticeUserListActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

        /*长按事件*/
        view1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                view1.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
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
        view2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                view2.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
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
        view3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                view3.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
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
        view4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                view4.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
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
        view5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                view5.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
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
        view6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                view6.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
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
        view7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                view7.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
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
        view8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(NoticeListActivity.this).setTitle("系统提示")//设置对话框标题
                        .setMessage("是否确认删除该条通知？")//设置显示的内容
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {//添加确定按钮
                            @Override
                            public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                                // TODO Auto-generated method stub
                                view8.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),"删除该条通知成功", Toast.LENGTH_SHORT).show();
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

}
