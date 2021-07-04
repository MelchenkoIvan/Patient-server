package pl.wsiz.iid6.gr2.patientserver.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "lek")
public class LekEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nazwa;
    private Boolean recept;
    private String producent;

    public LekEntity(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Boolean getRecept() {
        return recept;
    }

    public void setRecept(Boolean recept) {
        this.recept = recept;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public LekEntity(String nazwa, Boolean refundowany, String producent) {
        this.nazwa = nazwa;
        this.recept = refundowany;
        this.producent = producent;
    }

    public LekEntity() {
    }
}
