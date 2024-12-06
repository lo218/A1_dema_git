package org.example;

import java.time.LocalDate;

public class Passager extends Personne {
    String passeport;

    public Passager(int identifiant, String passeport) {
        super(identifiant);
        this.passeport = passeport;
    }

    public String getPasseport() {
        return passeport;
    }

    public void reserverVol(Vol vol) {
        Reservation reserv1 = new Reservation((int)(Math.random() *10000));
        reserv1.setVol(vol);
        reserv1.setClient(this);
        reserv1.setDateReservation(LocalDate.now());
        reserv1.setStatut("en creation");
    }
}
