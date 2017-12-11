package com.yushan.module_club.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.yushan.lib_base.base.BaseActivity;
import com.yushan.module_club.R;

@Route(path = "/module_club/ClubActivity")
public class ClubActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        Log.e("yushan","实验SourceTree");
    }
}
