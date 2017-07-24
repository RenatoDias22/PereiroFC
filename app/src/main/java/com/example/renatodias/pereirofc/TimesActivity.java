package com.example.renatodias.pereirofc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TimesActivity extends AppCompatActivity {

    List<Jogador> jogadoresSelecionados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(TimesActivity.this, "oi", Toast.LENGTH_SHORT).show();
            }
        });
        jogadoresSelecionados = GlobalClass.getJogadoresSelecionados();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        GlobalClass.jogadoresSelecionados = new ArrayList<>();
    }
}
