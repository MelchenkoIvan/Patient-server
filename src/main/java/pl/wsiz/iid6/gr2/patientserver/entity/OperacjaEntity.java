package pl.wsiz.iid6.gr2.patientserver.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "operacja")
public class OperacjaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_operacji;
    private String nazwaOper;
    private String typOperacji;
    private String liekarz;
    private String image;
    private double koszt_operacji;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public OperacjaEntity() {
    }

    public OperacjaEntity(int id_operacji, String imie, String typ_operacji, String lerkarz, double koszt_operacji) {
        this.id_operacji = id_operacji;
        this.nazwaOper = imie;
        this.typOperacji = typ_operacji;
        this.liekarz = lerkarz;
        this.koszt_operacji = koszt_operacji;
    }

    public OperacjaEntity(String nazwaOper, String typOperacji, String liekarz, double koszt_operacji) {
        this.nazwaOper = nazwaOper;
        this.typOperacji = typOperacji;
        this.liekarz = liekarz;
        this.koszt_operacji = koszt_operacji;
    }

    public String getNazwaOper() {
        return nazwaOper;
    }

    public void setNazwaOper(String nazwaOper) {
        this.nazwaOper = nazwaOper;
    }

    public String getTypOperacji() {
        return typOperacji;
    }

    public void setTypOperacji(String typOperacji) {
        this.typOperacji = typOperacji;
    }


    public String getLiekarz() {
        return liekarz;
    }

    public void setLiekarz(String liekarz) {
        this.liekarz = liekarz;
    }

    public double getKoszt_operacji() {
        return koszt_operacji;
    }

    public void setKoszt_operacji(double koszt_operacji) {
        this.koszt_operacji = koszt_operacji;
    }
}
