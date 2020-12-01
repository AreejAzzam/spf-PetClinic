package springframework.spfpet_clinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllerIndex {
    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index";
    }
}
