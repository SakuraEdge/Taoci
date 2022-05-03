package com.example.letao.project.loading_ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.Nullable;

import com.example.letao.MainActivity;
import com.example.letao.R;


public class Loading extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(()->{
          startActivity(new Intent(Loading.this, MainActivity.class));
          finish();
        },1500);
    }
}
