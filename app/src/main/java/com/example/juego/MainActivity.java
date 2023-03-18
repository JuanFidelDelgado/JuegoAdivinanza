package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView lblTitulo;
    private Button btnAccion;
    private EditText txtNumero;
    private TextView lblNumero;

    int n= (int) Math.floor(Math.random()*1000);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblTitulo=findViewById(R.id.lblTitulo);
        btnAccion=findViewById(R.id.btnAccion);
        btnAccion.setOnClickListener(this);
        txtNumero=findViewById(R.id.txtNumero);
        lblNumero=findViewById(R.id.lblNumero);
    }

    @Override
    public void onClick(View v) {
        btnAccion.setText("Probar");
        int prueba= Integer.parseInt(txtNumero.getText().toString());
        int suma=prueba+n;
        lblNumero.setText(""+prueba);
        if (n>1) {
            Toast.makeText(this, "FELICITACIONES!! Adivinaste el número "+prueba, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Sigue intentando", Toast.LENGTH_LONG).show();
        }

    }
}
