package com.example.renatodias.pereirofc.model;

import com.example.renatodias.pereirofc.R;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by renatodias on 24/07/17.
 */


public class Jogador extends RealmObject{
    public static final String ID = "com.example.renatodias.pereirofc.RealmObject,ID";

    @PrimaryKey
    private long id;
    private String nome;
    private int fotoPerfil;
    private byte[] foto;

    @Ignore
    private boolean selecionado;

    public Jogador(Jogador jogador) {
        this.id = jogador.id;
        this.nome = jogador.nome;
        this.fotoPerfil = jogador.fotoPerfil;
        this.foto = jogador.getFoto();
        this.selecionado = jogador.selecionado;
    }

    public Jogador(long id, String nome, int fotoPerfil, boolean selecionado) {
        this.id = id;
        this.nome = nome;
        this.fotoPerfil = fotoPerfil;
        this.selecionado = selecionado;
    }

    public Jogador() {

    }

    public long getId(){
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFotoPerfil(){
        return this.fotoPerfil;
    }

    public void setFotoPerfil(int fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public Boolean getSelecionado(){
        return this.selecionado;
    }

    public void setSelecionado(boolean selecionado){
        this.selecionado = selecionado;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
