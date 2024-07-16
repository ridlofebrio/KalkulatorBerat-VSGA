package com.example.beratbadan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class spalsh extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashbmi);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(spalsh.this, MainActivity.class));
                finish();
            }
        }, 2000);
    }

}
