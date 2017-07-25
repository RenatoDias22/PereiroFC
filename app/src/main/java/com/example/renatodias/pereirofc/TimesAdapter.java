package com.example.renatodias.pereirofc;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by renatodias on 25/07/17.
 */

public class TimesAdapter extends RecyclerView.Adapter<TimesAdapter.ViewHolderTimes> {

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
        public ImageView itemImage;
//        public ImageView checkOk;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolderTimes(View itemView) {
            super(itemView);
//            itemImage = (ImageView)itemView.findViewById(R.id.item_image_times);
//            itemTitle = (TextView)itemView.findViewById(R.id.item_title_times);
//            checkOk = (ImageView)itemView.findViewById(R.id.checkOk_times);
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
//        holder.itemTitle.setText(jogadores[position].getNome());
//        viewHolder.itemDetail.setText(details[i]);
//        holder.itemImage.setImageResource(jogadores[position].getFotoPerfil());
    }

    @Override
    public int getItemCount() {
//        return jogadores.length;
        return 1;
    }

}

