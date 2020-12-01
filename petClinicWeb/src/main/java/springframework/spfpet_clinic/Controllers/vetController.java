package springframework.spfpet_clinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class vetController {
    @RequestMapping({"/vet","/vet/index","/vet/intex.html"})
    public  String vetsList(){
        return "vet/index";

    }
}
