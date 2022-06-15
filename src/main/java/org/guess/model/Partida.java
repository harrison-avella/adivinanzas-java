package org.guess.model;

import java.util.ArrayList;

public class Partida {
    public Partida() {
    }

    //TODO: Revisar tipo de dato y donde se sacaran las imagenes
    private ArrayList<Byte> imagenes;
    private ArrayList<Nivel> niveles;
    private int tiempo;

    public Nivel seleccionarNivel(int i){
        return niveles.get(i);
    }

    public Adivinanza mostrarAdivinanza(Nivel nivel, int i){
       return nivel.seleccionarAdivinanza(i);
    }

    public int contadorTiempo(){
        return tiempo += 1;
    }

    public void perderVida(Jugador jugador){
        jugador.setVidas(jugador.mostrarVidas()-1);
    }

    public void perderPartida(Jugador jugador){
        jugador.setPuntos(jugador.mostrarPuntaje() - 5);
    }

    public void ganarPartida(Jugador jugador){
        jugador.setPuntos(jugador.mostrarPuntaje() + 5);
    }

}
