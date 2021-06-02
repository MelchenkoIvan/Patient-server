package pl.wsiz.iid6.gr2.patientserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.gr2.patientserver.dto.Pacjent;
import pl.wsiz.iid6.gr2.patientserver.service.PatientService;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    private PatientService patientService ;
    @GetMapping(path = "/hej")
    @ResponseBody
    public String witaj() {
        return "Witaj !!";
    }
    @GetMapping(path = "/wiek")
    @ResponseBody
    public String wiek(@RequestParam int wiek) {
        return "wiek:" + wiek;
    }
    @GetMapping(path = "/zycie")
    @ResponseBody
    public String zycie(@RequestParam int datayrodz ,@RequestParam int ostatniaData,@RequestParam boolean zyjeOrnie) {
        if (zyjeOrnie) {
            return "jescie zyje";
        }else{
            int zycie = ostatniaData- datayrodz;
            return Integer.toString(zycie);
        }
    }
    @GetMapping(path = "/id")
    @ResponseBody
    public String patientId(@RequestParam Long idP){
        return patientService.findbyId(idP).toString();
    }
    @GetMapping(path = "/ByName")
    @ResponseBody
    public String patientByName(@RequestParam String Name){
        return patientService.findByLastName(Name);
    }
}
