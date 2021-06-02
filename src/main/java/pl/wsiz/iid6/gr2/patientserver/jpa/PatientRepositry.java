package pl.wsiz.iid6.gr2.patientserver.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.gr2.patientserver.entity.PatientEntity;

import java.util.List;

public interface PatientRepositry extends CrudRepository<PatientEntity,Long> {
    List<PatientEntity> findAllByLastName(String lastName);

}
