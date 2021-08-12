package com.example.os;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private EditText cost;
    private TextView result;
    List<Integer> orders = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cost = findViewById(R.id.cost);
        result = findViewById(R.id.resulttxt);
        orders.add(45);
        orders.add(243);
        orders.add(23);
        orders.add(143);
        orders.add(443);
        Button tokenbtn = findViewById(R.id.calc);
        
        tokenbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int amt = Integer.parseInt(cost.getText().toString());
                orders.add(amt);
                Toast.makeText(MainActivity2.this, "added", Toast.LENGTH_SHORT).show();
                Collections.sort(orders);
                for (int i = 0; i < orders.size(); i++) {
                    if (orders.get(i) == amt){
                        result.setText(String.valueOf((i+1)));
                    }
                }
            }
        });
        

    }

}