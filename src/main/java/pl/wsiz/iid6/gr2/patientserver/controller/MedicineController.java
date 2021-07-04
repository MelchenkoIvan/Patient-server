package pl.wsiz.iid6.gr2.patientserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.gr2.patientserver.dto.Lek;
import pl.wsiz.iid6.gr2.patientserver.entity.LekEntity;
import pl.wsiz.iid6.gr2.patientserver.entity.PatientEntity;
import pl.wsiz.iid6.gr2.patientserver.service.LekService;

import java.util.List;


@Controller
@RequestMapping(value = "/medicine")
public class MedicineController {

    @Autowired
    private LekService lekService;



    @GetMapping(path="/findAllMedicine")
    public String listLeki(final ModelMap model) throws Exception {
        List<Lek> allLeki = lekService.findAll();
        model.addAttribute("leki", allLeki);
        return "lekiAll.html";
    }

}
