package pl.wsiz.iid6.gr2.patientserver.dto;

public class Operacja {
    private String nazwaOper;
    private String typOperacji;
    private String liekarz;
    private double koszt_operacji;


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


    public String getLerkarzy() {
        return liekarz;
    }

    public void setLerkarzy(String lerkarz) {
        this.liekarz = lerkarz;
    }

    public double getKoszt_operacji() {
        return koszt_operacji;
    }

    public void setKoszt_operacji(double koszt_operacji) {
        this.koszt_operacji = koszt_operacji;
    }

    public Operacja(String nazwaOper, String typ_operacji, String lerkarz, double koszt_operacji) {
        this.nazwaOper = nazwaOper;
        this.typOperacji = typ_operacji;
        this.liekarz = lerkarz;
        this.koszt_operacji = koszt_operacji;
    }
}
