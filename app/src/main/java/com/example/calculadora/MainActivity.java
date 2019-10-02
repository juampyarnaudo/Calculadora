package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;

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
    public void Tres (View view){
        String tres = et1.getText().toString();
        tres = tres+"3";
        et1.setText(tres);
    }
    public void Cuatro (View view){
        String cuatro = et1.getText().toString();
        cuatro = cuatro+"4";
        et1.setText(cuatro);
    }
    public void Cinco (View view){
        String cinco = et1.getText().toString();
        cinco = cinco+"5";
        et1.setText(cinco);
    }
    public void Seis (View view){
        String seis = et1.getText().toString();
        seis = seis+"6";
        et1.setText(seis);
    }
    public void Siete (View view){
        String siete = et1.getText().toString();
        siete = siete+"7";
        et1.setText(siete);
    }
    public void Ocho (View view){
        String ocho = et1.getText().toString();
        ocho = ocho+"8";
        et1.setText(ocho);
    }
    public void Nueve (View view){
        String nueve = et1.getText().toString();
        nueve = nueve+"9";
        et1.setText(nueve);
    }
    public void Coma (View view){
        String coma = et1.getText().toString();
        coma = coma+",";
        et1.setText(coma);
    }

}
