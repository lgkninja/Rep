package com.example.tip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText numberEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        numberEdit = findViewById(R.id.numberEdit);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(numberEdit.getText().toString());
                num = (num*1.2);
                    DecimalFormat df = new DecimalFormat();
                    df.setMaximumFractionDigits(2);
                    numberEdit.setText("The total bill with tip is: $" + df.format(num));
            }
        });
    }
}