package pl.wsiz.iid6.gr2.patientserver.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wsiz.iid6.gr2.patientserver.dto.Lek;
import pl.wsiz.iid6.gr2.patientserver.dto.Operacja;
import pl.wsiz.iid6.gr2.patientserver.service.LekService;
import pl.wsiz.iid6.gr2.patientserver.service.OperacjaService;

import java.util.List;

@RestController
@RequestMapping("/api/operacja")
public class OperacjaControllerJSON {
    @Autowired
    private OperacjaService operacjaService;
    @GetMapping(path="/all", produces = "application/json")
    public List<Operacja> allLek(){

        return operacjaService.findAll();
    }
}
