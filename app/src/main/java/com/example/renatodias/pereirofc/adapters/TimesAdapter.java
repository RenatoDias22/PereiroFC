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
//    private Jogador[] jogadores = {
//            new Jogador(1 ,"Renato Dias", R.drawable.renato_dias),
//            new Jogador(2 ,"Filippe Morais", R.drawable.filippe_morais),
//            new Jogador(3 ,"Renato Helsson", R.drawable.renato_helsson),
//            new Jogador(4 ,"Italo Siqueira", R.drawable.italo_siqueira),
//            new Jogador(5 ,"Wilson Vasconcelos", R.drawable.wilson_vasconcelos),
//            new Jogador(6 ,"Perboyre Morais", R.drawable.perboyre_morais),
//            new Jogador(7 ,"Bruno", R.drawable.bruno)
//
//    };

    class ViewHolderTimes extends RecyclerView.ViewHolder{

        public int currentItem;
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

//        public ImageView checkOk;
//        public TextView itemTitle;
//        public TextView itemDetail;

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
                    int position = getAdapterPosition();
//                    GlobalClass.jogadoresSelecionados.add(new Jogador(jogadores[position]));
//                    v.setBackgroundColor(Color.parseColor("#999999"));
//                    checkOk.setImageResource(R.drawable.ic_thumb_up_black_24dp);
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

//        if(time.size() > 2) {
            List<Jogador> time1 = time.get(0).getTime();
            holder.itemImageJogador_1_1.setImageResource(time1.get(0).getFotoPerfil());
            holder.itemImageJogador_1_2.setImageResource(time1.get(1).getFotoPerfil());
            holder.itemImageJogador_1_3.setImageResource(time1.get(2).getFotoPerfil());
            holder.itemImageJogador_1_4.setImageResource(time1.get(3).getFotoPerfil());

            holder.itemTexteJogador_1_1.setText(time1.get(0).getNome());
            holder.itemTexteJogador_1_2.setText(time1.get(1).getNome());
            holder.itemTexteJogador_1_3.setText(time1.get(2).getNome());
            holder.itemTexteJogador_1_4.setText(time1.get(3).getNome());

            List<Jogador> time2 = time.get(1).getTime();
            holder.itemImageJogador_2_1.setImageResource(time2.get(0).getFotoPerfil());
            holder.itemImageJogador_2_2.setImageResource(time2.get(1).getFotoPerfil());
            holder.itemImageJogador_2_3.setImageResource(time2.get(2).getFotoPerfil());
            holder.itemImageJogador_2_4.setImageResource(time2.get(3).getFotoPerfil());

            holder.itemTexteJogador_2_1.setText(time2.get(0).getNome());
            holder.itemTexteJogador_2_2.setText(time2.get(1).getNome());
            holder.itemTexteJogador_2_3.setText(time2.get(2).getNome());
            holder.itemTexteJogador_2_4.setText(time2.get(3).getNome());
//        }
//        holder.itemTitle.setText(jogadores[position].getNome());
//        viewHolder.itemDetail.setText(details[i]);
//        holder.itemImage.setImageResource(jogadores[position].getFotoPerfil());
    }

    @Override
    public int getItemCount() {
//        return jogadores.length;
        jogadores = GlobalClass.jogadoresSelecionados;
        Log.i("Global ficando null: ", "" + GlobalClass.jogadoresSelecionados);
        Times t = new Times();
        while (jogadores.size() > 0){
//            if(jogadores.size() > 3){
                int y = random.nextInt(jogadores.size());
                t.addJogador(jogadores.get(y));
                jogadores.remove(y);
//            }
            if (t.getSize() == 4 ) {
                time.add(t);
                t = new Times();
            }
        }

        return time.size()/2;
    }

}

