package com.example.xyzreader;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

import com.example.xyzreader.ui.ArticleListActivity;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, ArticleListActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }

}
