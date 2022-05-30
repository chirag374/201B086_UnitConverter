package com.example.a201b086_unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temp extends AppCompatActivity {
    Spinner sp11, sp12;
    EditText e6;
    Button b6;
    TextView t6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        e6 = findViewById(R.id.editTextNumber6);
        sp11 = findViewById(R.id.spinner11);
        sp12 = findViewById(R.id.spinner12);
        b6 = findViewById(R.id.button6);
        t6 = findViewById(R.id.textViewans6);

        String[] from = {"Celsius"};
        ArrayAdapter ad11 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp11.setAdapter(ad11);

        String[] to = {"Fahrenheit","Kelvin"};
        ArrayAdapter ad12 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp12.setAdapter(ad12);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double ans6;
                Double t = Double.parseDouble(e6.getText().toString());
                if(sp11.getSelectedItem().toString() == "Celsius" && sp12.getSelectedItem().toString() == "Fahrenheit"){
                    ans6 = (t*1.8)+32;
                    Toast.makeText(getApplicationContext(),ans6.toString(),Toast.LENGTH_LONG).show();
                    t6.setText("" + ans6);
                }
                else if(sp11.getSelectedItem().toString() == "Celsius" && sp12.getSelectedItem().toString() == "Kelvin"){
                    ans6 = t+273.15;
                    Toast.makeText(getApplicationContext(),ans6.toString(),Toast.LENGTH_LONG).show();
                    t6.setText("" + ans6);
                }
            }
        });

    }
}