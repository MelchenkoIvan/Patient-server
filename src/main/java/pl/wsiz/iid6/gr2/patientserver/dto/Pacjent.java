package pl.wsiz.iid6.gr2.patientserver.dto;

import java.util.List;

public class Pacjent extends Osoba {
    private int nrUbezpieczenia;
    private Osoba lekarzRodzinny;// albo string
    private List<Skierowanie> listaSkierowan;
    private List<Badanie> listaBadan;
    private Stan stanZdrowia;
    private List<String> leki;
    private List<Recepta> recepty;
}
