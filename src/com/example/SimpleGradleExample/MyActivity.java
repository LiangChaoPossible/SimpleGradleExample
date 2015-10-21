package com.example.SimpleGradleExample;

import com.mathutil.Suber;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {
    private TextView mTv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initUI();
        updateUI();
    }

    private void initUI() {
        mTv = (TextView) findViewById(R.id.tv);
    }

    private void updateUI(){
        Suber suber = new Suber();
        mTv.setText("sub val : " + suber.sub(10, 5));
    }
}
