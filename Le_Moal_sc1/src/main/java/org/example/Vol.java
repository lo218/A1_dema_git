package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vol {
    int numeroVol;
    Aeroport origine;
    Aeroport destination;
    LocalDateTime dateHeureDepart;
    LocalDateTime dateHeureArrivee;
    String etat;

    public Vol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public Aeroport getOrigine() {
        return origine;
    }

    public Aeroport getDestination() {
        return destination;
    }

    public LocalDateTime getDateHeureDepart() {
        return dateHeureDepart;
    }

    public LocalDateTime getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public String getEtat() {
        return etat;
    }
}
