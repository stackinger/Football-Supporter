package com.example.zhouk.footballsupporter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhouk.footballsupporter.base.BaseActivity;
import com.google.android.gms.common.api.GoogleApiClient;

public class NoticeDetailActivity extends BaseActivity {
    private final int requestCode = 1500;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_detail);

        setTitle("通知详细");
        setBackBtn();
    }

}
