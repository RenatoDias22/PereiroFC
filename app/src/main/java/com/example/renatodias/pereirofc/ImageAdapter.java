package com.example.renatodias.pereirofc;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

import javax.microedition.khronos.opengles.GL;

/**
 * Created by renatodias on 24/07/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    List<Jogador> jogadoresSelecionados;
    public ImageAdapter(Context c) {
        mContext = c;
        jogadoresSelecionados = GlobalClass.getJogadoresSelecionados();
    }

    public int getCount() {
        return jogadoresSelecionados.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(1090, 800));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(16, 16, 16, 16);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(R.drawable.quadra2);
//        imageView.setImageResource(jogadoresSelecionados.get(position).getFotoPerfil());
        return imageView;
    }


}
