package org.guess.model;

public class Jugador {

    private String nombre;
    private int vidas;
    private double puntos;

    public Jugador(String nombre, int vidas, double puntos) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int mostrarVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public double mostrarPuntaje() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public void jugar(){
        //TODO: agregar funcionalidad
    }


}
