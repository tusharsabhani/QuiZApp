package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = getIntent().getExtras();
        String valueReceived1 = bundle.getString("key1");

        TextView name = findViewById(R.id.name);
        name.setText(valueReceived1);

        button = findViewById(R.id.start);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        TextView value = findViewById(R.id.name);
        String name = value.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("key",name);
        startActivity(intent);
    }
}
