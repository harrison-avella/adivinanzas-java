package org.guess.model;

import java.util.ArrayList;

public class Nivel {

    private String dificultad;
    private ArrayList<Adivinanza> adivinanzas;

    public Adivinanza seleccionarAdivinanza(int i){
        return adivinanzas.get(i);
    }


}
