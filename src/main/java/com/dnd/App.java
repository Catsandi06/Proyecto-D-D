package com.dnd;

public class App {
    public static void main(String[] args) {
        Personaje eldrin = new Personaje("Eldrin", 3);
        eldrin.entrenar(4);
        eldrin.gastarEnergia(30);
        eldrin.mostrarInfo();
        Personaje.mostrarTotalPersonajes();

        Guerrero thorak = new Guerrero("Thorak", 5, "Hacha doble");
        thorak.ataquePesado();
        thorak.descansar(10);
        thorak.mostrarInfo();
        Personaje.mostrarTotalPersonajes();

        Mago lyra = new Mago("Lyra", 4, "Hielo");
        lyra.ataqueElemental();
        lyra.entrenar(2);
        lyra.mostrarInfo();
        Personaje.mostrarTotalPersonajes();

        Personaje[] reino = new Personaje[3];
        reino[0] = eldrin;
        reino[1] = thorak;
        reino[2] = lyra;

        for (Personaje p : reino) {
            p.mostrarInfo();
        }
    }
}