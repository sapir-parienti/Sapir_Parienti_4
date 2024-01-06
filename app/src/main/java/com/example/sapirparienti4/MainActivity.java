package com.example.sapirparienti4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i=1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
    }

    public void go(View view) {
        String s="THIS IS CLICK NUMBER: "+i;
        String s2="BOOM!";
        btn.setText(s);
        if(i%10==7||i%7==0)
            btn.setText(s2);
        i++;
    }
}