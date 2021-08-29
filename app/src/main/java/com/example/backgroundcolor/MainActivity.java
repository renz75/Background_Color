package com.example.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.blue);
    }

    public void RedColor(View v) {
        view.setBackgroundResource(R.color.red);
    }

    public void GreenColor(View v) {
        view.setBackgroundResource(R.color.green);
    }

    public void BlueColor(View v) {
        view.setBackgroundResource(R.color.blue);
    }

}