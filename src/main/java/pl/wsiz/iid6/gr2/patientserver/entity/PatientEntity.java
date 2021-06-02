package pl.wsiz.iid6.gr2.patientserver.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "patient")//domyślnie jest jak klasa!
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String pesel;
    private int NR_UBEZPIECZENIA;

    @Override
    public String toString() {
        return String.format(
                "Patient[id=%d, firstName='%s', lastName='%s',nrUbiezp='%s']",
                id, firstName, lastName, pesel,NR_UBEZPIECZENIA);
    }
    public PatientEntity(String firstName, String lastName, String pesel,int NR_UBEZPIECZENIA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.NR_UBEZPIECZENIA = NR_UBEZPIECZENIA;
    }
    public PatientEntity() {

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPesel() {
        return pesel;
    }
    public int getnrUbiezp() {
        return NR_UBEZPIECZENIA;
    }
}