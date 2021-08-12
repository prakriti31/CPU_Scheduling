package com.example.os;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.LinkedList;
import java.util.Queue;

public class MainActivity1 extends AppCompatActivity {

    private EditText name,mobile;
    private TextView result;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        result = findViewById(R.id.result);
        Button submit = findViewById(R.id.submit);
        Button status = findViewById(R.id.status);
        Queue<String> queue = new LinkedList<>();
        queue.add("Prakriti");
        queue.add("Aviral");
        queue.add("Priyank");

        submit.setOnClickListener(v -> {
            queue.add(name.getText().toString());
            name.setText("");
            mobile.setText("");
            Toast.makeText(MainActivity1.this, "Your name has been added to the queue :)", Toast.LENGTH_SHORT).show();
        });

        status.setOnClickListener(v -> result.setText("Your token number is: "+ queue.size()));


    }
}