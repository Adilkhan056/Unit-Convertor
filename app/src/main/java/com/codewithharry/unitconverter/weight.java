package com.codewithharry.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class weight extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editext = findViewById(R.id.editText);

    }
    public void calculate(View view) {
        String s = editext.getText().toString();
        double grams = Double.parseDouble(s);
        double kgs = grams / 1000;
        textView.setText("The corresponding value in kgs is " + kgs);
    }
}