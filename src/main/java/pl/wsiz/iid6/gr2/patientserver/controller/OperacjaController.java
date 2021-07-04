package pl.wsiz.iid6.gr2.patientserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.wsiz.iid6.gr2.patientserver.dto.Operacja;
import pl.wsiz.iid6.gr2.patientserver.entity.OperacjaEntity;
import pl.wsiz.iid6.gr2.patientserver.service.LekService;
import pl.wsiz.iid6.gr2.patientserver.service.OperacjaService;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class OperacjaController {
    @Autowired
    private OperacjaService OperacjaService;


    @GetMapping(value = "/")
    public String operacje(final ModelMap model) throws Exception {
        List<Operacja> alloperations = OperacjaService.findAll();
        model.addAttribute("operations" , alloperations);
        return "OperationsAll.html";


}

}