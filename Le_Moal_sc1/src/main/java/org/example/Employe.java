package org.example;

public class Employe extends Personne {

    int numeroEmploye;
    int dateEmbauche;

    public Employe(int identifiant, int numeroEmploye) {
        super(identifiant);
        this.numeroEmploye = numeroEmploye;
    }

    public int getNumeroEmploye() {
        return numeroEmploye;
    }

    public int getDateEmbauche() {
        return dateEmbauche;
    }
}
