package com.example.renatodias.pereirofc.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by renatodias on 05/03/2018.
 */

public class PersonJogador extends RealmObject{

    @PrimaryKey
    private long id;

    private RealmList<Jogador> jogadores;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RealmList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(RealmList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
