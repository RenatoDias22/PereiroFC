package com.example.renatodias.pereirofc.activitys;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.renatodias.pereirofc.R;

import java.io.IOException;

public class CadastrarJogadorActivity extends AppCompatActivity {
    public Toolbar toolbar;
    private static final int PICK_IMAGE_REQUEST = 1;


    private ImageView fotoJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_jogador);

        fotoJogador = (ImageView)findViewById(R.id.button_camera);


        toolbar = (Toolbar) findViewById(R.id.my_toolbar_cadastro);
        toolbar.setTitle("Pereiro FC");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setNavigationIcon(R.mipmap.pereirofc);
        setSupportActionBar(toolbar);

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PICK_IMAGE_REQUEST ) {
            Uri uri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                fotoJogador.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CadastrarJogadorActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressed();

        }

        return super.onKeyDown(keyCode, event);
    }

    public void addFoto(View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    public void addJogador(View view) {
        Toast.makeText(this, "Jogador add", Toast.LENGTH_LONG);
    }
}
