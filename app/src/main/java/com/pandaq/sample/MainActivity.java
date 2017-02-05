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
    @BindView(R.id.tv_value1)
    TextView mTvValue1;
    @BindView(R.id.tv_value2)
    TextView mTvValue2;
    @BindView(R.id.tv_value3)
    TextView mTvValue3;
    @BindView(R.id.tv_value4)
    TextView mTvValue4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mLsv1.setOnValueChangeListener(new ValueChangeListener(1));
        mLsv2.setOnValueChangeListener(new ValueChangeListener(2));
        mLsv3.setOnValueChangeListener(new ValueChangeListener(3));
        mLsv4.setOnValueChangeListener(new ValueChangeListener(4));
    }

    class ValueChangeListener implements LoopScaleView.OnValueChangeListener {
        private int type;

        public ValueChangeListener(int type) {
            this.type = type;
        }

        @Override
        public void OnValueChange(int newValue) {
            switch (type) {
                case 1:
                    mTvValue1.setText("身高 "+newValue+" cm");
                    break;
                case 2:
                    mTvValue2.setText("身高 "+newValue+" cm");
                    break;
                case 3:
                    mTvValue3.setText("重量 "+newValue+" g");
                    break;
                case 4:
                    mTvValue4.setText("长度 "+newValue+" cm");
                    break;
            }
        }
    }
}
