package com.example.renatodias.pereirofc.activitys;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;

import com.example.renatodias.pereirofc.GlobalClass;
import com.example.renatodias.pereirofc.model.Jogador;
import com.example.renatodias.pereirofc.R;
import com.example.renatodias.pereirofc.adapters.TimesAdapter;

import java.util.ArrayList;
import java.util.List;

public class TimesActivity extends AppCompatActivity {

    List<Jogador> jogadoresSelecionados;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar_times);
        toolbar.setTitle("Pereiro FC");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setNavigationIcon(R.mipmap.pereirofc);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled( true );
        }

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

    @Override
    public void onBackPressed() {
        GlobalClass.jogadoresSelecionados = new ArrayList<>();
        Intent intent = new Intent(TimesActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            GlobalClass.jogadoresSelecionados = new ArrayList<>();
            onBackPressed();

        }

        return super.onKeyDown(keyCode, event);
    }
}
