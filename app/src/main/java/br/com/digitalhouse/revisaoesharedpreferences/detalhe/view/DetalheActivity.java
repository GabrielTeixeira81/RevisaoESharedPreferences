package br.com.digitalhouse.revisaoesharedpreferences.detalhe.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import br.com.digitalhouse.revisaoesharedpreferences.R;
import br.com.digitalhouse.revisaoesharedpreferences.model.Contato;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

//Valido se veio alguma coisa na intent
        if (getIntent() != null && getIntent().getExtras() != null){
            Contato contato = getIntent().getParcelableExtra("CONTATO");

            if (contato != null) {
                // Posso usar o contato para mostrar os dados na tela
            }

    }
    }

}
