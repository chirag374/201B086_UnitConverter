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

public class Currency extends AppCompatActivity {

        Spinner sp1,sp2;
        EditText e1;
        Button b1;
        TextView t1;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_currency);
            e1 = findViewById(R.id.editTextNumber);
            sp1 = findViewById(R.id.spinner1);
            sp2 = findViewById(R.id.spinner2);
            b1 = findViewById(R.id.button1);
            t1 = findViewById(R.id.textView12);

            String[] from = {"USD"};
            ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
            sp1.setAdapter(ad);

            String[] to = {"Indian Rupees","SriLankan Rupees"};
            ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
            sp2.setAdapter(ad1);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double ans;
                    Double amount = Double.parseDouble(e1.getText().toString());
                    if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indian Rupees"){
                        ans = amount*77.40;
                        Toast.makeText(getApplicationContext(),ans.toString(),Toast.LENGTH_LONG).show();
                        t1.setText("" + ans);
                    }
                    else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "SriLankan Rupees"){
                        ans = amount*360.21;
                        Toast.makeText(getApplicationContext(),ans.toString(),Toast.LENGTH_LONG).show();
                        t1.setText("" + ans);
                    }
                }
            });
        }
    }