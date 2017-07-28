package com.example.renatodias.pereirofc.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.renatodias.pereirofc.GlobalClass;
import com.example.renatodias.pereirofc.R;
import com.example.renatodias.pereirofc.model.Jogador;

public class JogadorAdapter extends RecyclerView.Adapter<JogadorAdapter.ViewHolder> {

    private Jogador[] jogadores = {
            new Jogador(0  , "Bruno", R.drawable.bruno, false),
            new Jogador(1  , "Daniel Santos", R.drawable.daniel_santos, false),
            new Jogador(2  , "Edyfabio Gomes", R.drawable.edyfabio_gomes, false),
            new Jogador(3  , "Filippe Morais", R.drawable.filippe_morais, false),
            new Jogador(4  , "Fred Morais", R.drawable.fred_morais, false),
            new Jogador(5  , "Golinha", R.drawable.gola, false),
            new Jogador(6  , "Hermeson", R.drawable.jogador_sem_foto, false),
            new Jogador(7  , "Italo Siqueira", R.drawable.italo_siqueira, false),
            new Jogador(8  , "João de Arão", R.drawable.joao_arao, false),
            new Jogador(9  , "Junior Maciel", R.drawable.junior_maciel, false),
            new Jogador(10 , "Luiz Carlos", R.drawable.luiz_carlos, false),
            new Jogador(11 , "Marcos Paulo", R.drawable.marcos_paulo_morais, false),
            new Jogador(12 , "Paulivan", R.drawable.paulivan, false),
            new Jogador(13 , "Perboyre Morais", R.drawable.perboyre_morais, false),
            new Jogador(14 , "Raul Feitosa", R.drawable.jogador_sem_foto, false),
            new Jogador(15 , "Renato Dias", R.drawable.renato_dias, false),
            new Jogador(16 , "Renato Helsson", R.drawable.renato_helsson, false),
            new Jogador(17 , "Roberto Euclides", R.drawable.roberto_euclides, false),
            new Jogador(18 , "Romim", R.drawable.romim, false),
            new Jogador(19 , "Samuel Desidério", R.drawable.samuel_desiderio, false),
            new Jogador(20 , "Thiago Santos", R.drawable.jogador_sem_foto, false),
            new Jogador(21 , "Wilson Vasconcelos", R.drawable.wilson_vasconcelos, false)
    };

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView itemImage;
        public ImageView checkOk;
        public TextView itemTitle;


        public ViewHolder(final View itemView) {
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
                        checkOk.setImageResource(R.drawable.ic_check_black_24dp);
                        checkOk.setVisibility(View.VISIBLE);
                        v.setClickable(false);
                        jogadores[position].setSelecionado(true);
                    }else{
//                        v.setBackgroundColor(Color.parseColor("#f2f2f2"));
                        checkOk.setImageResource(R.drawable.ic_check_black_24dp);
                        checkOk.setVisibility(View.INVISIBLE);
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
        return new ViewHolder(v);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(jogadores[i].getNome());
        viewHolder.itemImage.setImageResource(jogadores[i].getFotoPerfil());

        if(jogadores[i].getSelecionado()){
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#999999"));
            viewHolder.checkOk.setImageResource(R.drawable.ic_check_black_24dp);
            viewHolder.checkOk.setVisibility(View.VISIBLE);
            viewHolder.itemView.setClickable(false);
        }else {
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#f2f2f2"));
            viewHolder.itemView.setClickable(true);
            viewHolder.checkOk.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return jogadores.length;
    }

}
