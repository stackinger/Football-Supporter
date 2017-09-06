package com.example.zhouk.footballsupporter;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.FileNotFoundException;

public class NewsEditDetailActivity extends BaseActivity {
    private final int requestCode = 1500;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_edit_detail);

        final ImageView imageView = (ImageView) findViewById(R.id.ne_iv01);
        imageView.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent();
            /* 开启Pictures画面Type设定为image */
            intent.setType("image/*");
            /* 使用Intent.ACTION_GET_CONTENT这个Action */
            intent.setAction(Intent.ACTION_GET_CONTENT);
            /* 取得相片后返回本画面 */
            startActivityForResult(intent, 1);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


        setTitle("新闻详细");
        setBackBtn();

        paragraph();
        ToNewList();
        toPingJia();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            Uri uri = data.getData();
            Log.e("uri", uri.toString());
            ContentResolver cr = this.getContentResolver();
            try {
                Bitmap bitmap = BitmapFactory.decodeStream(cr.openInputStream(uri));
                ImageView imageView = (ImageView) findViewById(R.id.ne_iv01);
                /* 将Bitmap设定到ImageView */
                imageView.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                Log.e("Exception", e.getMessage(), e);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("EditField Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    /*确定按钮跳转到添加成功*/
    protected void ToNewList() {
        Button button = (Button) findViewById(R.id.ne_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"新闻编辑成功", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(NewsEditDetailActivity.this, NewsListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NewsEditDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }

    /*确定按钮跳转到添加成功*/
    protected void toPingJia() {
        Button button = (Button) findViewById(R.id.ne_pingjia);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(NewsEditDetailActivity.this, NewsPingJiaActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是NewsEditDetailActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });
    }


    /*操作段落按钮*/
    protected void paragraph(){
        /*添加段落*/
        Button button = (Button) findViewById(R.id.ne_addBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView cardView = (CardView) findViewById(R.id.ne_card2);
                cardView.setVisibility(View.VISIBLE);
            }
        });
        /*删除段落一*/
        Button delBtn1 = (Button) findViewById(R.id.ne_delBtn01);
        delBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView cardView = (CardView) findViewById(R.id.ne_card1);
                cardView.setVisibility(View.GONE);
            }
        });
        /*删除段落二*/
        Button delBtn2 = (Button) findViewById(R.id.ne_delBtn02);
        delBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView cardView = (CardView) findViewById(R.id.ne_card2);
                cardView.setVisibility(View.GONE);
            }
        });

    }
}
