package com.example.renatodias.pereirofc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TimesActivity extends AppCompatActivity {

    List<Jogador> jogadoresSelecionados;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);
        recyclerView =
                (RecyclerView) findViewById(R.id.recycler_view_times);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new TimesAdapter();
        recyclerView.setAdapter(adapter);

        jogadoresSelecionados = GlobalClass.getJogadoresSelecionados();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        GlobalClass.jogadoresSelecionados = new ArrayList<>();
    }
}
