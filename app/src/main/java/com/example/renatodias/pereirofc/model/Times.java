package com.example.renatodias.pereirofc.model;

import com.example.renatodias.pereirofc.model.Jogador;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renatodias on 27/07/17.
 */

public class Times {
    List<Jogador> time1;
    List<Jogador> time2;
    public Times(){
        this.time1 = new ArrayList<>();
        this.time2 = new ArrayList<>();
    }

    public void addJogador1(Jogador j){
        this.time1.add(j);
    }

    public List<Jogador> getTime1(){
        return this.time1;
    }

    public int getSizeTime1(){
        return time1.size();
    }
    public void addJogador2(Jogador j){
        this.time2.add(j);
    }

    public List<Jogador> getTime2(){
        return this.time2;
    }

    public int getSizeTime2(){
        return time2.size();
    }

}
