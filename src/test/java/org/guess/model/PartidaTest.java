package org.guess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartidaTest {

    @Test
    public void perderPartidaTest(){
        Partida partida = new Partida();
        Jugador jugador = new Jugador("Pepe", 3, 10);
        partida.perderPartida(jugador);
        assertEquals(5,jugador.mostrarPuntaje());
    }

    @Test
    public void ganarPartidaTest(){
        Partida partida = new Partida();
        Jugador jugador = new Jugador("Pepe", 3, 10);
        partida.ganarPartida(jugador);
        assertEquals(15,jugador.mostrarPuntaje());
    }

    @Test
    public void perderVidaTest(){
        Partida partida = new Partida();
        Jugador jugador = new Jugador("Pepe", 3, 10);
        partida.perderVida(jugador);
        assertEquals(2,jugador.mostrarVidas());
    }

}
