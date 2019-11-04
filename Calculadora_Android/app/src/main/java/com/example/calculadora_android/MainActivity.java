package com.example.calculadora_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvDisplay;
    int numeroUno;
    int numeroDos;
    int resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnCero (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"0");
    }

    public void BtnUno (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"1");
    }

    public void BtnDos (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"2");
    }

    public void BtnTres (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"3");
    }

    public void BtnCuatro (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"4");
    }
    public void BtnCinco (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"5");
    }
    public void BtnSeis (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"6");
    }

    public void BtnSiete (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"7");
    }

    public void BtnOcho (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"8");
    }

    public void BtnNueve (View view){

        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"9");
    }

    public void OnClickOperacionCampturaNumeroUno (View view){
        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        numeroUno = Integer.parseInt(tvDisplay.getText().toString());
        tvDisplay.setText("");
    }

    public void Suma(View view){
        operador = "+";
        OnClickOperacionCampturaNumeroUno(view);
    }

    public void BtnIgual (View view){
        tvDisplay = (TextView) findViewById(R.id.TvDisplay);
        numeroDos = Integer.parseInt(tvDisplay.getText().toString());

        if(operador.equals("+")){
            resultado = numeroUno + numeroDos;
        }
    }
}
