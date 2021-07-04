package pl.wsiz.iid6.gr2.patientserver.dto;

public class Lek {
    private String nazwa;
    private Boolean recept;
    private String producent;


    public Lek(String nazwa, Boolean recept, String producent) {
        this.nazwa = nazwa;
        this.recept = recept;
        this.producent = producent;
    }

    public Lek(String nazwa) {
        this.nazwa = nazwa;
    }

    public Lek() {
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

    @Override
    public String toString() {
        return "Lek{" +
                "nazwa='" + nazwa + '\'' +
                ", producent='" + producent + '\'' +
                '}';
    }
}
