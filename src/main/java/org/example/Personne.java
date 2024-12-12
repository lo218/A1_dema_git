package org.example;

public class Personne {
    int identifiant;
    String nom;
    String adresse;
    String contact;

    public Personne(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getContact() {
        return contact;
    }

    public void obtenirInfos() {
        System.out.println(Integer.toString(identifiant));
        System.out.println(nom);
        System.out.println(adresse);
        System.out.println(contact);
    }

    public String obtenirRole(Personne personne) {
        if (personne instanceof Pilote) {
            return "Pilote";
        }
        else if (personne instanceof PersonnelCabine) {
            return "PersonnelCabine";
        }
        else return "Passager";
    }
}
