package com.yinhuan.slidingbacklayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

/**
 * Created by yinhuan on 2017/3/2.
 */

public class SlidingBackActivity extends AppCompatActivity {

    protected SlidingBackLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = (SlidingBackLayout) LayoutInflater.from(this).inflate(
                R.layout.base, null);
        layout.attachToActivity(this);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.base_slide_right_in, R.anim.base_slide_remain);
    }




    // Press the back button in mobile phone
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.base_slide_right_out);
    }
}
