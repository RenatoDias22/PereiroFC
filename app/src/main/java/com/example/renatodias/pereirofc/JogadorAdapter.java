package com.example.renatodias.pereirofc;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JogadorAdapter extends RecyclerView.Adapter<JogadorAdapter.ViewHolder> {

    private Jogador[] jogadores = {
            new Jogador(0 ,"Bruno", R.drawable.bruno, false),
            new Jogador(1,"Edyfabio Gomes", R.drawable.edyfabio_gomes, false),
            new Jogador(2,"Gola", R.drawable.gola, false),
            new Jogador(3 ,"Filippe Morais", R.drawable.filippe_morais, false),
            new Jogador(4 ,"Italo Siqueira", R.drawable.italo_siqueira, false),
            new Jogador(5, "Luiz Carlos", R.drawable.luiz_carlos, false),
            new Jogador(6 ,"Perboyre Morais", R.drawable.perboyre_morais, false),
            new Jogador(7 ,"Renato Dias", R.drawable.renato_dias, false),
            new Jogador(8 ,"Renato Helsson", R.drawable.renato_helsson, false),
            new Jogador(9 ,"Romim", R.drawable.romim, false),
            new Jogador(10 ,"Wilson Vasconcelos", R.drawable.wilson_vasconcelos, false)

    };

    class ViewHolder extends RecyclerView.ViewHolder {
        public View aux;

        public int currentItem;
        public ImageView itemImage;
        public ImageView checkOk;
        public TextView itemTitle;
        public TextView itemDetail;


        public ViewHolder(final View itemView, int i, boolean selectend) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            checkOk = (ImageView)itemView.findViewById(R.id.checkOk);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    if(jogadores[position].getSelecionado() == false) {
                        GlobalClass.jogadoresSelecionados.add(new Jogador(jogadores[position]));
                        v.setBackgroundColor(Color.parseColor("#999999"));
//                        checkOk.setImageResource(R.drawable.ic_thumb_up_black_24dp);
                        v.setClickable(false);
                        jogadores[position].setSelecionado(true);
                    }else{
                        v.setBackgroundColor(Color.parseColor("#ffffff"));
//                        checkOk.setImageResource(R.drawable.ic_thumb_up_black_24dp);
                        v.setClickable(true);
                    }
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);

        return new ViewHolder(v, i, jogadores[i].getSelecionado());
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(jogadores[i].getNome());
//        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(jogadores[i].getFotoPerfil());

        if(jogadores[i].getSelecionado()){
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#999999"));
//            viewHolder.checkOk.setImageResource(R.drawable.ic_thumb_up_black_24dp);
            viewHolder.itemView.setClickable(false);
        }else {
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
            viewHolder.itemView.setClickable(true);
        }
    }

    @Override
    public int getItemCount() {
        return jogadores.length;
    }

}
