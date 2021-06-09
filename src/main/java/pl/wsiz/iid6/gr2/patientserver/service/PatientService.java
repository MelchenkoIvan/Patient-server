package pl.wsiz.iid6.gr2.patientserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientserver.dto.Pacjent;
import pl.wsiz.iid6.gr2.patientserver.entity.PatientEntity;
import pl.wsiz.iid6.gr2.patientserver.jpa.PatientRepositry;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepositry patientRepository;

    public Pacjent findbyId(Long id) {
        Optional<PatientEntity> res = patientRepository.findById(id);
        if (res.isPresent()) {
            PatientEntity pat = res.get();
            return new Pacjent(pat.getFirstName(), pat.getLastName(), pat.getPesel(),pat.getnrUbiezp());
        }
        return new Pacjent("None", "None","2342394023400", '0');
    }
    public String findByLastName(String name){
        List<PatientEntity> rs = patientRepository.findAllByLastName(name);
        return rs.toString();
    }
    public List<PatientEntity> findAllPatient(){
        List<PatientEntity> rs = patientRepository.findAll();
        return  rs;
    }
}