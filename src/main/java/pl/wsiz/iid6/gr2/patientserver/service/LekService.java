package pl.wsiz.iid6.gr2.patientserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientserver.dto.Lek;
import pl.wsiz.iid6.gr2.patientserver.entity.LekEntity;
import pl.wsiz.iid6.gr2.patientserver.jpa.LekRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LekService {
    @Autowired
    private LekRepository lekRepository;
    public Lek findById(Long id){
        Optional<LekEntity> rekrut = lekRepository.findById(id);
        if(rekrut.isPresent()) {
            LekEntity l = rekrut.get();
            return new Lek(l.getNazwa(),l.getRecept() ,l.getProducent());
        }
        return new Lek();
    }

    public List<Lek> findAll(){
        List<Lek> lista = new ArrayList<>();
        for(LekEntity rk:lekRepository.findAll()) {
            lista.add(new Lek(rk.getNazwa(),rk.getRecept(),rk.getProducent()));
        }
        return lista;
    }

    public List<Lek> findAllByNazwa(String nazwa){
        List<Lek> lista = new ArrayList<>();
        for(LekEntity rk:lekRepository.findAllByNazwa(nazwa)) {
            lista.add(new Lek(rk.getNazwa(),rk.getRecept(),rk.getProducent()));
        }
        return lista;
    }
    public List<Lek> findAllByProducent(String producent){
        List<Lek> lista = new ArrayList<>();
        for(LekEntity rk:lekRepository.findAllByProducent(producent)){
            lista.add(new Lek(rk.getNazwa(),rk.getRecept(),rk.getProducent()));
        }
        return lista;
    }
}
