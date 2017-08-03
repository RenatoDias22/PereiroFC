package com.example.renatodias.pereirofc.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.renatodias.pereirofc.GlobalClass;
import com.example.renatodias.pereirofc.R;
import com.example.renatodias.pereirofc.model.Jogador;
import com.example.renatodias.pereirofc.model.Jogador;
import com.example.renatodias.pereirofc.model.Times;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by renatodias on 25/07/17.
 */

public class TimesAdapter extends RecyclerView.Adapter<TimesAdapter.ViewHolderTimes> {
    Random random = new Random();
    List<Times> time = new ArrayList<>();
    List<Jogador> jogadores = new ArrayList<>();

    class ViewHolderTimes extends RecyclerView.ViewHolder{

        public ImageView itemImageJogador_1_1;
        public ImageView itemImageJogador_1_2;
        public ImageView itemImageJogador_1_3;
        public ImageView itemImageJogador_1_4;
        public ImageView itemImageJogador_2_1;
        public ImageView itemImageJogador_2_2;
        public ImageView itemImageJogador_2_3;
        public ImageView itemImageJogador_2_4;

        public TextView itemTexteJogador_1_1;
        public TextView itemTexteJogador_1_2;
        public TextView itemTexteJogador_1_3;
        public TextView itemTexteJogador_1_4;
        public TextView itemTexteJogador_2_1;
        public TextView itemTexteJogador_2_2;
        public TextView itemTexteJogador_2_3;
        public TextView itemTexteJogador_2_4;

        public ViewHolderTimes(View itemView) {
            super(itemView);
            itemImageJogador_1_1 = (ImageView) itemView.findViewById(R.id.item_image_jogador_1_1);
            itemImageJogador_1_2 = (ImageView) itemView.findViewById(R.id.item_image_jogador_1_2);
            itemImageJogador_1_3 = (ImageView) itemView.findViewById(R.id.item_image_jogador_1_3);
            itemImageJogador_1_4 = (ImageView) itemView.findViewById(R.id.item_image_jogador_1_4);
            itemImageJogador_2_1 = (ImageView) itemView.findViewById(R.id.item_image_jogador_2_1);
            itemImageJogador_2_2 = (ImageView) itemView.findViewById(R.id.item_image_jogador_2_2);
            itemImageJogador_2_3 = (ImageView) itemView.findViewById(R.id.item_image_jogador_2_3);
            itemImageJogador_2_4 = (ImageView) itemView.findViewById(R.id.item_image_jogador_2_4);

            itemTexteJogador_1_1 = (TextView) itemView.findViewById(R.id.item_texte_jogador_1_1);
            itemTexteJogador_1_2 = (TextView) itemView.findViewById(R.id.item_texte_jogador_1_2);
            itemTexteJogador_1_3 = (TextView) itemView.findViewById(R.id.item_texte_jogador_1_3);
            itemTexteJogador_1_4 = (TextView) itemView.findViewById(R.id.item_texte_jogador_1_4);
            itemTexteJogador_2_1 = (TextView) itemView.findViewById(R.id.item_texte_jogador_2_1);
            itemTexteJogador_2_2 = (TextView) itemView.findViewById(R.id.item_texte_jogador_2_2);
            itemTexteJogador_2_3 = (TextView) itemView.findViewById(R.id.item_texte_jogador_2_3);
            itemTexteJogador_2_4 = (TextView) itemView.findViewById(R.id.item_texte_jogador_2_4);

            // itemDetail = (TextView)itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    v.setClickable(false);
                }
            });
        }
    }

    public ViewHolderTimes onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout_times, viewGroup, false);
        ViewHolderTimes viewHolderTimes = new ViewHolderTimes(v);
        return viewHolderTimes;
    }

    @Override
    public void onBindViewHolder(ViewHolderTimes holder, int position) {

        if(time.get(position).getTime1() != null) {
            List<Jogador> time1 = time.get(position).getTime1();
            if (time1.size() > 0) {
                holder.itemImageJogador_1_1.setImageResource(time1.get(0).getFotoPerfil());
                holder.itemTexteJogador_1_1.setText(time1.get(0).getNome());
            }
            if (time1.size() > 1) {
                holder.itemImageJogador_1_2.setImageResource(time1.get(1).getFotoPerfil());
                holder.itemTexteJogador_1_2.setText(time1.get(1).getNome());
            }
            if (time1.size() > 2) {
                holder.itemImageJogador_1_3.setImageResource(time1.get(2).getFotoPerfil());
                holder.itemTexteJogador_1_3.setText(time1.get(2).getNome());
            }
            if (time1.size() > 3) {
                holder.itemImageJogador_1_4.setImageResource(time1.get(3).getFotoPerfil());
                holder.itemTexteJogador_1_4.setText(time1.get(3).getNome());
            }
        }
        if(time.get(position).getTime2() != null) {
            List<Jogador> time2 = time.get(position).getTime2();
            if (time2.size() > 0) {
                holder.itemImageJogador_2_1.setImageResource(time2.get(0).getFotoPerfil());
                holder.itemTexteJogador_2_1.setText(time2.get(0).getNome());
            }

            if (time2.size() > 1) {
                holder.itemImageJogador_2_2.setImageResource(time2.get(1).getFotoPerfil());
                holder.itemTexteJogador_2_2.setText(time2.get(1).getNome());
            }

            if (time2.size() > 2) {
                holder.itemImageJogador_2_3.setImageResource(time2.get(2).getFotoPerfil());
                holder.itemTexteJogador_2_3.setText(time2.get(2).getNome());
            }
            if (time2.size() > 3) {
                holder.itemImageJogador_2_4.setImageResource(time2.get(3).getFotoPerfil());
                holder.itemTexteJogador_2_4.setText(time2.get(3).getNome());
            }
        }
    }

    @Override
    public int getItemCount() {

        jogadores = GlobalClass.jogadoresSelecionados;
        Times t = new Times();

        while (jogadores.size() > 0){
            int tm = 0;
            while (tm != 4 && jogadores.size() > 0) {
                int y = random.nextInt(jogadores.size());
                t.addJogador1(jogadores.get(y));
                jogadores.remove(y);
                tm++;
            }
            tm = 0;
            while (tm != 4 && jogadores.size() > 0) {
                int z = random.nextInt(jogadores.size());
                t.addJogador2(jogadores.get(z));
                jogadores.remove(z);
                tm++;
            }

            time.add(t);
            t = new Times();
        }

        return time.size();
    }

}

