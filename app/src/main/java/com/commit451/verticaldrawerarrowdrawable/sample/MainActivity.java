package com.commit451.verticaldrawerarrowdrawable.sample;

import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.commit451.verticaldrawerarrowdrawable.VerticalDrawerArrowDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        final VerticalDrawerArrowDrawable drawerArrowDrawable = new VerticalDrawerArrowDrawable(this);
//        drawerArrowDrawable.setColor(Color.WHITE);
        //drawerArrowDrawable.setSpinEnabled(false);
        //drawerArrowDrawable.setDirection(VerticalDrawerArrowDrawable.ARROW_DIRECTION_DOWN);
        toolbar.setNavigationIcon(drawerArrowDrawable);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerArrowDrawable.getProgress() == 0.0f) {
                    ObjectAnimator.ofObject(drawerArrowDrawable, "progress", new FloatEvaluator(), 0.0f, 1.0f)
                            .start();
                } else if (drawerArrowDrawable.getProgress() == 1.0f) {
                    ObjectAnimator.ofObject(drawerArrowDrawable, "progress", new FloatEvaluator(), 1.0f, 0.0f)
                            .start();
                }
            }
        });
    }
}
