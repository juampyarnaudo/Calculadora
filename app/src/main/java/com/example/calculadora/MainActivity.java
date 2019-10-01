package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
    }

    public void Cero (View view){
        String cero = et1.getText().toString();
        cero = cero+"0";
        et1.setText(cero);
    }
    public void Uno (View view){
        String uno = et1.getText().toString();
        uno = uno+"1";
        et1.setText(uno);
    }
    public void Dos (View view){
        String dos = et1.getText().toString();
        dos = dos+"2";
        et1.setText(dos);
    }
}
