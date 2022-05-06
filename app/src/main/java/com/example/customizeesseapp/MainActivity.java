package com.example.customizeesseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Atributos
    private ImageView imagem;
    private CheckBox chkRoxo;
    private CheckBox chkRosa;
    private CheckBox chkVerde;
    private RadioGroup radioGroup;
    private RadioButton radMamiferos;
    private RadioButton radAves;
    private RadioButton radRepteis;
    private Switch swiBranco;
    private Button btnAplicar;
    private TextView txtCustomize;
    private TextView txtImagem;
    private TextView txtCores;
    private TextView txtLetras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.imagem);
        chkRoxo = findViewById(R.id.chkRoxo);
        chkRosa = findViewById(R.id.chkRosa);
        chkVerde = findViewById(R.id.chkVerde);
        radioGroup = findViewById(R.id.RadioGroup);
        radMamiferos = findViewById(R.id.radMamiferos);
        radAves = findViewById(R.id.radAves);
        radRepteis = findViewById(R.id.radAves);
        btnAplicar = findViewById(R.id.btnAplicar);
        txtCustomize = findViewById(R.id.txtCustomize);
        txtImagem = findViewById(R.id.txtImagem);
        txtCores = findViewById(R.id.txtCores);
        txtLetras = findViewById(R.id.txtLetras);

        radioGroup.setOnCheckedChangeListener( new EscutadorRadio());
        btnAplicar.setOnClickListener( new EscutadorBotao() );
    }

    private class EscutadorBotao implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            //mandando mensagem:
            String msg = "Cor(es) preferidas: ";
            if(chkRoxo.isChecked()){
                msg += "| Roxo |";
            }
            if(chkRosa.isChecked()){
                msg += "| Rosa |";
            }
            if(chkVerde.isChecked()){
                msg += "| Verde |";
            }
            if(swiBranco.isChecked()){
                //mudar letras para branco e fundo para azul
            }
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }

    private class EscutadorRadio implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch ( i ) {
                case R.id.radMamiferos:
                    imagem.setImageResource(R.drawable.cachorrogato);
                    break;
                case R.id.radAves:
                    imagem.setImageResource(R.drawable.patos);
                    break;
                case R.id.radRepteis:
                    imagem.setImageResource(R.drawable.repteis);
                    break;
            }
        }
    }
}