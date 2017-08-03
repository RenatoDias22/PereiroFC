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
            new Jogador(1  , "Breno Falcão", R.drawable.jogador_sem_foto, false),
            new Jogador(2  , "Daniel Santos", R.drawable.daniel_santos, false),
            new Jogador(3  , "Edyfabio Gomes", R.drawable.edyfabio_gomes, false),
            new Jogador(4  , "Eli", R.drawable.jogador_sem_foto, false),
            new Jogador(5  , "Filippe Morais", R.drawable.filippe_morais, false),
            new Jogador(6  , "Fred Morais", R.drawable.fred_morais, false),
            new Jogador(7  , "Golinha", R.drawable.gola, false),
            new Jogador(8  , "Hermeson", R.drawable.jogador_sem_foto, false),
            new Jogador(9  , "Iltinho", R.drawable.jogador_sem_foto, false),
            new Jogador(10 , "Italo Siqueira", R.drawable.italo_siqueira, false),
            new Jogador(11 , "João de Arão", R.drawable.joao_arao, false),
            new Jogador(12 , "Junior Maciel", R.drawable.junior_maciel, false),
            new Jogador(13 , "Luiz Carlos", R.drawable.luiz_carlos, false),
            new Jogador(14 , "Marcos Paulo", R.drawable.marcos_paulo_morais, false),
            new Jogador(15 , "Naldo", R.drawable.jogador_sem_foto, false),
            new Jogador(16 , "Netão", R.drawable.jogador_sem_foto, false),
            new Jogador(17 , "Paulivan", R.drawable.paulivan, false),
            new Jogador(18 , "Perboyre Morais", R.drawable.perboyre_morais, false),
            new Jogador(19 , "Raul Feitosa", R.drawable.jogador_sem_foto, false),
            new Jogador(20 , "Renato Dias", R.drawable.renato_dias, false),
            new Jogador(21 , "Renato Helsson", R.drawable.renato_helsson, false),
            new Jogador(22 , "Roberto Euclides", R.drawable.roberto_euclides, false),
            new Jogador(23 , "Romim", R.drawable.romim, false),
            new Jogador(24 , "Rondinelly Morais ", R.drawable.jogador_sem_foto, false),
            new Jogador(25 , "Samuel Desidério", R.drawable.samuel_desiderio, false),
            new Jogador(26 , "Thiago Santos", R.drawable.jogador_sem_foto, false),
            new Jogador(27 , "Wilson Vasconcelos", R.drawable.wilson_vasconcelos, false)
    };

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView itemImage;
        public ImageView checkOk;
        public ImageView background;
        public TextView itemTitle;


        public ViewHolder(final View itemView) {
            super(itemView);
            itemImage  = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle  = (TextView)itemView.findViewById(R.id.item_title);
            checkOk    = (ImageView)itemView.findViewById(R.id.checkOk);
            background = (ImageView) itemView.findViewById(R.id.item_image_fundo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    if(jogadores[position].getSelecionado() == false) {
                        GlobalClass.jogadoresSelecionados.add(new Jogador(jogadores[position]));
                        background.setBackgroundColor(Color.parseColor("#999999"));
                        checkOk.setImageResource(R.mipmap.checkbola);
                        checkOk.setVisibility(View.VISIBLE);
                        v.setClickable(false);
                        jogadores[position].setSelecionado(true);
                    }else{
                        checkOk.setImageResource(R.mipmap.checkbola);
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
            viewHolder.background.setBackgroundColor(Color.parseColor("#999999"));
            viewHolder.checkOk.setImageResource(R.mipmap.checkbola);
            viewHolder.checkOk.setVisibility(View.VISIBLE);
            viewHolder.itemView.setClickable(false);
        }else {
            viewHolder.background.setBackgroundColor(Color.parseColor("#f2f2f2"));
            viewHolder.itemView.setClickable(true);
            viewHolder.checkOk.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return jogadores.length;
    }

}
