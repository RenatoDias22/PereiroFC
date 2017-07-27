package com.example.renatodias.pereirofc;

/**
 * Created by renatodias on 24/07/17.
 */


class Jogador{
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

    public Jogador[] Jogadores() {
        Jogador[] jogadores = {
                new Jogador(1 ,"Renato Dias", R.drawable.renato_dias, false)

        };
        return jogadores;
    }
}
