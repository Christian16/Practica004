package com.hermesis.christian.practica004;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    CheckBox checkBold, checkItalic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.txt);
        checkBold = (CheckBox) findViewById(R.id.checkBold);
        checkItalic = (CheckBox) findViewById(R.id.checkItalic);

        checkBold.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (checkBold.isChecked())
                    editText.setTypeface(null, Typeface.BOLD);
                else
                    editText.setTypeface(null, Typeface.NORMAL);
            }

        });

        checkItalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkItalic.isChecked())
                    editText.setTypeface(null,Typeface.ITALIC);
                else
                    editText.setTypeface(null, Typeface.NORMAL);
            }
        });

        }


    }

