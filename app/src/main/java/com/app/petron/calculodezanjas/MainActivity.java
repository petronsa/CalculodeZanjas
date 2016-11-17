package com.app.petron.calculodezanjas;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//double ai,as,at,av,res,db,alin;
   // EditText alto,alve,anin,ansup,resul2;
    Button pulsar;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pulsar = (Button)findViewById(R.id.boton);
        pulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculo();
            }

        });
    }
    public void calculo(){
        double ai = 0,as = 0,at = 0,av = 0,res,db,alin;
        EditText ansup = (EditText) findViewById(R.id.ansup);
        ansup.getText().toString();
                if(ansup.getText().toString().length() == 0){
                    ansup.setError("Entre un número");
                }else {
                    as = Double.parseDouble(ansup.getText().toString());
                }

        EditText anin = (EditText) findViewById(R.id.anin);
        anin.getText().toString();

        if(anin.getText().toString().length() == 0){
            anin.setError("Entre un número");
        }else {
            ai = Double.parseDouble(anin.getText().toString());
        }

        EditText alto = (EditText) findViewById(R.id.at);
        alto.getText().toString();

               if(alto.getText().toString().length() == 0) {
                    alto.setError("Entre un número");
                }else{
                   at= Double.parseDouble(alto.getText().toString());
               }

        EditText alve = (EditText) findViewById(R.id.av);
        alve.getText().toString();

            if(alve.getText().toString().length() == 0) {
                    alve.setError("Entre un número");
                }else{
                av= Double.parseDouble(alve.getText().toString());
            }

         alin = at-av;
         db = as-ai;
        resultado = (TextView)findViewById(R.id.tvresultado);
        res = ((alin*db)/at)+ai;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        resultado.setText(nf.format(res));

    }
}
