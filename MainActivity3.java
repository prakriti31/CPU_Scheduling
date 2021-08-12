package com.example.os;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.Queue;

public class MainActivity3 extends AppCompatActivity {

    private EditText cost;
    private TextView result;
    private int amt ;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        cost = findViewById(R.id.amount);
        result = findViewById(R.id.tokresult);
        Button submit = findViewById(R.id.banksubmit);
        Queue<Integer> amounts = new LinkedList<Integer>();
        amounts.add(2000);
        amounts.add(1000);
        amounts.add(2231);
        amounts.add(2342);


        submit.setOnClickListener(v -> {
            amt = Integer.parseInt(cost.getText().toString());
            amounts.add(amt);
            cost.setText("");
            Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
            result.setText("Your waiting number is: "+ amounts.size());
        });

    }
}