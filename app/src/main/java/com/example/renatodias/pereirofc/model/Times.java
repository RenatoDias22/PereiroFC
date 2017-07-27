package com.example.renatodias.pereirofc.model;

import com.example.renatodias.pereirofc.model.Jogador;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renatodias on 27/07/17.
 */

public class Times {
    List<Jogador> time;
    public Times(){
        time = new ArrayList<>();
    }

    public void addJogador(Jogador j){
        this.time.add(j);
    }

    public List<Jogador> getTime(){
        return this.time;
    }

    public int getSize(){
        return time.size();
    }
}
