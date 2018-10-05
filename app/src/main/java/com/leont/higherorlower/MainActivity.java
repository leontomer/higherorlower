package com.leont.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int  n = rand.nextInt(20) + 1;
    public void Guess(View view){
        EditText e=findViewById(R.id.editText2);
        String s=e.getText().toString();
        int num= Integer.parseInt(s);
        if(num<1||num>20)
            return;
        if(num<n)
            Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_LONG).show();
        if(num>n)
            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_LONG).show();
        if(num==n){
            Toast.makeText(MainActivity.this, "That's right! try again", Toast.LENGTH_LONG).show();
            n=rand.nextInt(20) + 1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
