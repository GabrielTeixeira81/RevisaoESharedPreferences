package br.com.digitalhouse.revisaoesharedpreferences.home.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.revisaoesharedpreferences.R;
import br.com.digitalhouse.revisaoesharedpreferences.detalhe.view.DetalheActivity;
import br.com.digitalhouse.revisaoesharedpreferences.model.Contato;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //add findView ById para recycler
        // Configurar recycler



        return view;
    }

    private List<Contato> getContatos() {
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Gabriel", "11-91111-1111", R.drawable.wolverine));
        contatos.add(new Contato("Alexia", "11-91231-3322", R.drawable.fenix));
        contatos.add(new Contato("Marcelo", "11-91111-7653", R.drawable.ciclope));
        contatos.add(new Contato("Jéssica", "11-91534-1199", R.drawable.psylocke));
        contatos.add(new Contato("Roberto", "11-91987-1251", R.drawable.gambit));
        contatos.add(new Contato("Tairo", "11-91090-1244", R.drawable.magneto));


        return contatos;
    }


    @Override
    public void onClik(Contato contato) {

        Intent intent = new Intent(this, DetalheActivity.class);
        intent.putExtra("CONTATO", contato);
        startActivity(intent);

    }
}



