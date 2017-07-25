package com.example.renatodias.pereirofc;

/**
 * Created by renatodias on 24/07/17.
 */


class Jogador{
    private int id;
    private String nome;
    private int fotoPerfil;

    public Jogador(Jogador jogador) {
        this.id = jogador.id;
        this.nome = jogador.nome;
        this.fotoPerfil = jogador.fotoPerfil;
    }

    public Jogador() {
        this.id = -1;
        this.nome = null;
        this.fotoPerfil = -1;
    }
    public Jogador(int id, String nome, int fotoPerfil) {
        this.id = id;
        this.nome = nome;
        this.fotoPerfil = fotoPerfil;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public int getFotoPerfil(){
        return this.fotoPerfil;
    }

    public Jogador[] Jogadores() {
        Jogador[] jogadores = {
                new Jogador(1 ,"Renato Dias", R.drawable.renato_dias),
                new Jogador(2 ,"Filippe Morais", R.drawable.filippe_morais),
                new Jogador(3 ,"Renato Helsson", R.drawable.renato_helsson),
                new Jogador(4 ,"Italo Siqueira", R.drawable.italo_siqueira),
                new Jogador(5 ,"Wilson Vasconcelos", R.drawable.wilson_vasconcelos),
                new Jogador(6 ,"Perboyre Morais", R.drawable.perboyre_morais),
                new Jogador(7 ,"Bruno", R.drawable.bruno)

        };
        return jogadores;
    }
}
