package com.denis.trafficlight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

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
       red();
    }
    public void onYellowButtonClick(View view) {
        yellow();
    }
    public void onGreenButtonClick(View view) {
      green();
    }


    public void onAutomaticChangeOverButtonClick(View view) {
        Toast.makeText(getApplicationContext(),
                "Цвет будет менятся каждые десять секунд",
                Toast.LENGTH_SHORT).show();

        for (int i = 0; i>3;i++){

        }
    }

    public void onStopButtonClick(View view) {
    }

    public void onExitButtonClick(View view) {
        finish();
    }

    private void red(){
        mInfoTextView.setText(R.string.redText);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.readColor));
    }
    private void yellow(){
        mInfoTextView.setText(R.string.yellowText);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));

    }
    private void green(){
        mInfoTextView.setText(R.string.greenText);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
    }
}
