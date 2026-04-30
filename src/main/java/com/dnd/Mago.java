package com.dnd;

public class Mago extends Personaje {
    private String elemento;

    public Mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nivel: " + nivel + ", Elemento: " + elemento);
    }

    public void ataqueElemental() {
        gastarEnergia(25);
    }
}