package pl.wsiz.iid6.gr2.patientserver.service;

import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientserver.dto.Lek;

@Service
public class LekService {
    private Lek[] leki = {
            new Lek("Ibuprom", "Sanofi"),
            new Lek("szczepionka", "Astra"),
            new Lek("Paracetamol", "Polfa")};

    public Lek findLek(String nazwa){
        for (Lek lek: leki){
            if(lek.getNazwa().equals(nazwa)){
                return lek;
            }
        }
        return new Lek(nazwa);
    }
    public String getallLek(){
        String tmp = "";
        for (Lek lek: leki) {
             tmp += lek.getNazwa() +lek.getProducent();
        }
        return tmp;
    }
}
