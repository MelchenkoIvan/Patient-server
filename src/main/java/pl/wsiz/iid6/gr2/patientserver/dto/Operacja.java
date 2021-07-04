package pl.wsiz.iid6.gr2.patientserver.dto;

public class Operacja {
    private String nazwaOper;
    private String typOperacji;
    private String liekarz;
    private String image;
    private double koszt_operacji;

    public Operacja(String nazwaOper, String typOperacji, String liekarz,  double koszt_operacji ,String image) {
        this.nazwaOper = nazwaOper;
        this.typOperacji = typOperacji;
        this.liekarz = liekarz;
        this.image = image;
        this.koszt_operacji = koszt_operacji;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Operacja() {
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

    public Operacja(String nazwaOper, String typ_operacji, String liekarz, double koszt_operacji) {
        this.nazwaOper = nazwaOper;
        this.typOperacji = typ_operacji;
        this.liekarz = liekarz;
        this.koszt_operacji = koszt_operacji;
    }
}
