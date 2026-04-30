package com.dnd;

public class Guerrero extends Personaje {
    private String arma;

    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Energia: " + energia + ", Arma: " + arma);
    }

    public void ataquePesado() {
        gastarEnergia(15);
    }
}