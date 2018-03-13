package com.example.renatodias.pereirofc.activitys;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.renatodias.pereirofc.R;
import com.example.renatodias.pereirofc.model.Jogador;
import com.example.renatodias.pereirofc.model.PersonJogador;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import io.realm.Realm;
import io.realm.RealmResults;

public class CadastrarJogadorActivity extends AppCompatActivity {
    public Toolbar toolbar;
    private static final int PICK_IMAGE_REQUEST = 1;
    Realm realm;
    RealmResults<Jogador> jogadores;

    Jogador play = new Jogador();

    private ImageView fotoJogador;

    private TextView namePlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_jogador);

        toolbar = (Toolbar) findViewById(R.id.my_toolbar_cadastro);
        toolbar.setTitle("Pereiro FC");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setNavigationIcon(R.mipmap.pereirofc);
        setSupportActionBar(toolbar);

        realm = Realm.getInstance(this);
        jogadores = realm.where(Jogador.class).findAll();

        if(getIntent() != null && getIntent().getLongExtra(Jogador.ID, 0) > 0) {
            play.setId(getIntent().getLongExtra(Jogador.ID, 0));
            play = jogadores.where().equalTo("id", play.getId()).findAll().get(0);
        }

        fotoJogador = (ImageView)findViewById(R.id.button_camera);
        namePlay = (TextView)findViewById(R.id.nome_jogador);

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PICK_IMAGE_REQUEST ) {
            if(data != null) {
                Uri uri = data.getData();

                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                    Bitmap bitmap2 = rotate(bitmap, -90);
                    fotoJogador.setImageBitmap(bitmap2);
                    play.setFotoPerfil(fotoJogador.getId());

                    final Handler handler = new Handler(Looper.getMainLooper());
                    final int tempoDeEspera = 500;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            SystemClock.sleep(tempoDeEspera);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    Bitmap bmp = ((BitmapDrawable) fotoJogador.getDrawable()).getBitmap();
                                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                                    bmp.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                                    byte[] byteArray = stream.toByteArray();
                                    play.setFoto(byteArray);
                                }
                            });
                        }
                    }).start();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Bitmap rotate(Bitmap bitmap, float degrees) {
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
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

        if(play.getId() == 0) {
            jogadores.sort( "id", RealmResults.SORT_ORDER_DESCENDING);
            long id = jogadores.size() == 0 ? 1 : jogadores.get(0).getId() + 1;
            play.setId(id);
        }

        try {
            play.setNome(this.namePlay.getText().toString());
            realm.beginTransaction();
            realm.copyToRealmOrUpdate(play);
            realm.commitTransaction();
            Toast.makeText(this, "Jogador adicionado com sucesso!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(CadastrarJogadorActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
