package com.example.a201b086_unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickCurrency(View view) {
        Intent intent = new Intent(this, Currency.class);
        startActivity(intent);
    }
    public void clickLength(View view) {
        Intent intent1 = new Intent(this, Length.class);
        startActivity(intent1);
    }
    public void clickTemp(View view) {
        Intent intent2 = new Intent(this, Temp.class);
        startActivity(intent2);
    }
}