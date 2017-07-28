package com.example.renatodias.pereirofc.model;

import com.example.renatodias.pereirofc.R;

/**
 * Created by renatodias on 24/07/17.
 */


public class Jogador{
    private int id;
    private String nome;
    private int fotoPerfil;
    private boolean selecionado;

    public Jogador(Jogador jogador) {
        this.id = jogador.id;
        this.nome = jogador.nome;
        this.fotoPerfil = jogador.fotoPerfil;
        this.selecionado = jogador.selecionado;
    }

    public Jogador(int id, String nome, int fotoPerfil, boolean selecionado) {
        this.id = id;
        this.nome = nome;
        this.fotoPerfil = fotoPerfil;
        this.selecionado = selecionado;
    }

    public Jogador() {

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }

    public int getFotoPerfil(){
        return this.fotoPerfil;
    }

    public Boolean getSelecionado(){
        return this.selecionado;
    }

    public void setSelecionado(boolean selecionado){
        this.selecionado = selecionado;
    }

//    public static Jogador[] Jogadores() {
//        Jogador[] jogadores = {
//                new Jogador(0  , "Bruno", R.drawable.bruno, false),
//                new Jogador(1  , "Daniel Santos", R.drawable.daniel_santos, false),
//                new Jogador(2  , "Edyfabio Gomes", R.drawable.edyfabio_gomes, false),
//                new Jogador(3  , "Filippe Morais", R.drawable.filippe_morais, false),
//                new Jogador(4  , "Golinha", R.drawable.gola, false),
//                new Jogador(5  , "Hermeson", R.drawable.jogador_sem_foto, false),
//                new Jogador(6  , "Italo Siqueira", R.drawable.italo_siqueira, false),
//                new Jogador(7  , "João de Arão", R.drawable.joao_arao, false),
//                new Jogador(8  , "Luiz Carlos", R.drawable.luiz_carlos, false),
//                new Jogador(9  , "Paulivan", R.drawable.paulivan, false),
//                new Jogador(10  , "Perboyre Morais", R.drawable.perboyre_morais, false),
//                new Jogador(11  , "Renato Dias", R.drawable.renato_dias, false),
//                new Jogador(12 , "Renato Helsson", R.drawable.renato_helsson, false),
//                new Jogador(13 , "Romim", R.drawable.romim, false),
//                new Jogador(14 , "Wilson Vasconcelos", R.drawable.wilson_vasconcelos, false)
//        };
//        return jogadores;
//    }
}
