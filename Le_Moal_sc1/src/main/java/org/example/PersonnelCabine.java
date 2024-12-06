package org.example;

public class PersonnelCabine extends Employe {

    String qualification;

    public PersonnelCabine(int identifiant, int numeroEmploye, String qualification) {
        super(identifiant, numeroEmploye);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }
}
