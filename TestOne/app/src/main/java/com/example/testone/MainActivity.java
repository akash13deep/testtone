package com.example.testone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText et1,et2,et3;
Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.namedit);
        et2 = findViewById(R.id.useredit);
        et3 = findViewById(R.id.passedit);

        bt = findViewById(R.id.logbut);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(et1.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(MainActivity.this, "Please Enter Student Name ", Toast.LENGTH_SHORT).show();
            return;
        }
        if(et2.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(MainActivity.this, "Please Enter UserName ", Toast.LENGTH_SHORT).show();
            return;
        }

        if(et3.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(MainActivity.this, "Please Enter Password ", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!(et2.getText().toString().equalsIgnoreCase("student1"))){
            Toast.makeText(MainActivity.this, "Invaild UserName Try Again! ", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!(et3.getText().toString().equalsIgnoreCase("123456"))){
            Toast.makeText(MainActivity.this, "Invaild Password ", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("studentName",et1.getText().toString());
        startActivity(intent);

    }
    }

