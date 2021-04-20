package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count;
    Button button;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        count=0;
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buttonCount);
        text=findViewById(R.id.textViewCount);
        text.setText(String.valueOf(count).toString());
    }

    public void IncreaseCount(View view) {
        count=Integer.parseInt(text.getText().toString());
        count++;
        text.setText(String.valueOf(count));
    }
}