package com.dnd;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int energia;
    private static int totalPersonajes = 0;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
        totalPersonajes++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void entrenar(int x) {
        if (x > 0) {
            nivel += x;
        }
    }

    public void descansar(int x) {
        if (x > 0) {
            energia += x;
            if (energia > 100) {
                energia = 100;
            }
        }
    }

    public void gastarEnergia(int x) {
        energia -= x;
        if (energia < 0) {
            energia = 0;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Energia: " + energia);
    }

    public static void mostrarTotalPersonajes() {
        System.out.println("Total de personajes: " + totalPersonajes);
    }
}