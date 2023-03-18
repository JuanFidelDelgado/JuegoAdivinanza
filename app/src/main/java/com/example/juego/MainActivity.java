package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView lblTitulo;
    private Button btnAccion;
    private EditText txtNumero;
    private TextView lblNumero, lblNumero1;

    int n= (int) Math.floor(Math.random()*1000);
    int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblTitulo=findViewById(R.id.lblTitulo);
        btnAccion=findViewById(R.id.btnAccion);
        btnAccion.setOnClickListener(this);
        txtNumero=findViewById(R.id.txtNumero);
        lblNumero=findViewById(R.id.lblNumero);
        lblNumero1=findViewById(R.id.lblNumero1);
        Toast.makeText(this, "ADIVINA QUE NÚMERO ESTOY PENSANDO...", Toast.LENGTH_LONG).show();
    }

    //@Override
    public void onClick(View v) {
        int prueba= Integer.parseInt(txtNumero.getText().toString());
        if (prueba==n) {
            //Toast.makeText(this, "ADIVINASTE!!! "+n+" ERA EL NÚMERO CORRECTO"+"\n LO LOGRASTE DESPUÉS DE "+contador+" INTENTOS", Toast.LENGTH_LONG).show();
            lblNumero.setText("LO LOGRASTE!!! "+"\nADIVINASTE!!! "+n+" ERA EL NÚMERO CORRECTO"+"\nLO LOGRASTE DESPUÉS DE "+contador+" INTENTOS");
            //finish();
        } else {
            if (prueba>n) {
                contador+=1;
                Toast.makeText(this, "JAJAJA... EL NÚMERO QUE ESTOY PENSANDO ES MENOR", Toast.LENGTH_LONG).show();
                txtNumero.setText("");
            } else {
                contador+=1;
                Toast.makeText(this, "JAJAJA... EL NÚMERO QUE ESTOY PENSANDO ES MAYOR", Toast.LENGTH_LONG).show();
                txtNumero.setText("");
            }
        }
        lblNumero1.setText(""+n);
    }
}