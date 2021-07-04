package pl.wsiz.iid6.gr2.patientserver.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.gr2.patientserver.entity.LekEntity;
import pl.wsiz.iid6.gr2.patientserver.entity.PatientEntity;

import java.util.List;

public interface LekRepository extends CrudRepository<LekEntity,Long> {
    List<LekEntity> findAllByNazwa(String nazwa);
    List<LekEntity> findAllByProducent(String producent);
    List<LekEntity> findAll();
}
