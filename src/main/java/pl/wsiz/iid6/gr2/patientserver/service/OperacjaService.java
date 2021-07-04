package pl.wsiz.iid6.gr2.patientserver.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientserver.dto.Operacja;
import pl.wsiz.iid6.gr2.patientserver.entity.OperacjaEntity;
import pl.wsiz.iid6.gr2.patientserver.jpa.OperacjaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class OperacjaService {

    @Autowired
    private OperacjaRepository operacjaRepository;

    public Operacja findById(Long id){
        Optional<OperacjaEntity> op = operacjaRepository.findById(id);
        if(op.isPresent()) {
            OperacjaEntity l = op.get();
            return new Operacja(l.getNazwaOper(),l.getTypOperacji(),l.getLiekarz(),l.getKoszt_operacji());
        }
        return new Operacja();
    }

    public List<Operacja> findAll(){
        List<Operacja> lista = new ArrayList<>();
        for(OperacjaEntity l:operacjaRepository.findAll()) {
            lista.add(new Operacja(l.getNazwaOper(),l.getTypOperacji(),l.getLiekarz(),l.getKoszt_operacji() ,l.getImage()));
        }
        return lista;
    }

    public List<Operacja> findAllByNazwaOper(String NazwaOp){
        List<Operacja> lista = new ArrayList<>();
        for(OperacjaEntity l:operacjaRepository.findAllByNazwaOper(NazwaOp)) {
            lista.add(new Operacja(l.getNazwaOper(),l.getTypOperacji(),l.getLiekarz(),l.getKoszt_operacji()));
        }
        return lista;
    }
    public List<Operacja> findAllByliekarz(String liekarz){
        List<Operacja> lista = new ArrayList<>();
        for(OperacjaEntity l:operacjaRepository.findAllByLiekarz(liekarz)){
            lista.add(new Operacja(l.getNazwaOper(),l.getTypOperacji(),l.getLiekarz(),l.getKoszt_operacji()));
        }
        return lista;
    }
    public List<Operacja> findAllBytyp_operacji(String operac){
        List<Operacja> lista = new ArrayList<>();
        for(OperacjaEntity l:operacjaRepository.findAllByTypOperacji(operac)){
            lista.add(new Operacja(l.getNazwaOper(),l.getTypOperacji(),l.getLiekarz(),l.getKoszt_operacji()));
        }
        return lista;
    }
}
