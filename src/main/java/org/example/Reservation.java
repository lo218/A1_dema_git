package org.example;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class Reservation {
    int numeroReservation;
    LocalDate dateReservation;
    String statut;
    Passager client;
    Vol vol;

    Deque<Reservation> listeReservations = new ArrayDeque<>();

    public Reservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
        listeReservations.add(this);
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public Passager getClient() {
        return client;
    }

    public Vol getVol() {
        return vol;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setClient(Passager client) {
        this.client = client;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public void annulerReservation(int numeroReservation) {
        for (Reservation reserv : listeReservations) {
            if (reserv.getNumeroReservation() == numeroReservation) {
                listeReservations.remove(reserv);
            }
            break;
        }
    }

    public Reservation obtenirReservation(int numeroReservation) {
        for (Reservation reserv : listeReservations) {
            if (reserv.getNumeroReservation() == numeroReservation) {
                return reserv;
            }
        }
        return null;
    }
}










