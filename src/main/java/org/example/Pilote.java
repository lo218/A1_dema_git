package org.example;

public class Pilote extends Employe {

    String licence;
    int heureDeVol;

    public Pilote(int identifiant, int numeroEmploye, String licence) {
        super(identifiant, numeroEmploye);
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public int getHeureDeVol() {
        return heureDeVol;
    }

}
