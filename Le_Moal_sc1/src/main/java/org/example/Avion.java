package org.example;

public class Avion {
    String immatriculation;
    String modele;
    int capacite;

    public Avion(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public int getCapacite() {
        return capacite;
    }
}
