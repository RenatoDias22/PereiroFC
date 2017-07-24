package com.example.renatodias.pereirofc;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renatodias on 24/07/17.
 */

public class GlobalClass extends Application {

    public static List<Jogador> jogadoresSelecionados = new ArrayList<>();

    public static List<Jogador> getJogadoresSelecionados() {
        return jogadoresSelecionados;
    }

}
