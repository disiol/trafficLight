package com.denis.trafficlight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);
    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.redText);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.readColor));
    }
    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.yellowText);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
    }
    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.greenText);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
    }


}
