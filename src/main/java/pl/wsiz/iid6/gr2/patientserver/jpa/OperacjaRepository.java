package pl.wsiz.iid6.gr2.patientserver.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.gr2.patientserver.entity.LekEntity;
import pl.wsiz.iid6.gr2.patientserver.entity.OperacjaEntity;

import java.util.List;

public interface OperacjaRepository extends CrudRepository<OperacjaEntity,Long> {
    List<OperacjaEntity> findAllByTypOperacji(String operac);
    List<OperacjaEntity> findAllByLiekarz(String liekarz);
    List<OperacjaEntity> findAllByNazwaOper(String NazwaOp);
    List<OperacjaEntity> findAll();
}
