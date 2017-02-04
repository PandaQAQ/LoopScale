package com.pandaq.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.pandaq.loopscaleview.LoopScaleView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.lsv_1)
    LoopScaleView mLsv1;
    @BindView(R.id.lsv_2)
    LoopScaleView mLsv2;
    @BindView(R.id.lsv_3)
    LoopScaleView mLsv3;
    @BindView(R.id.lsv_4)
    LoopScaleView mLsv4;
    @BindView(R.id.tv_value)
    TextView mTvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mLsv1.setOnValueChangeListener(new LoopScaleView.OnValueChangeListener() {
            @Override
            public void OnValueChange(int newValue) {
                mTvValue.setText(newValue);
            }
        });
    }
}
