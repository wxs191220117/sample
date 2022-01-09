package com.dnielfe.manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        Button bt = findViewById(R.id.login);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent intent = new Intent(Lab3Activity.this,BrowserActivity.class);
                startActivity(intent);

            }
        });
    }
}