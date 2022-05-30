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

public class Length extends AppCompatActivity {
    Spinner sp7,sp8;
    EditText e4;
    Button b4;
    TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        e4 = findViewById(R.id.editTextNumber4);
        sp7 = findViewById(R.id.spinner7);
        sp8 = findViewById(R.id.spinner8);
        b4 = findViewById(R.id.button4);
        t4 = findViewById(R.id.textViewans4);

        String[] from = {"Meter"};
        ArrayAdapter ad7 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp7.setAdapter(ad7);

        String[] to = {"CentiMeter","KiloMeter"};
        ArrayAdapter ad8 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp8.setAdapter(ad8);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double ans4;
                Double length = Double.parseDouble(e4.getText().toString());
                if(sp7.getSelectedItem().toString() == "Meter" && sp8.getSelectedItem().toString() == "CentiMeter"){
                    ans4 = length*100;
                    Toast.makeText(getApplicationContext(),ans4.toString(),Toast.LENGTH_LONG).show();
                    t4.setText("" + ans4);
                }
                else if(sp7.getSelectedItem().toString() == "Meter" && sp8.getSelectedItem().toString() == "KiloMeter"){
                    ans4 = length/1000;
                    Toast.makeText(getApplicationContext(),ans4.toString(),Toast.LENGTH_LONG).show();
                    t4.setText("" + ans4);
                }
            }
        });
    }
}