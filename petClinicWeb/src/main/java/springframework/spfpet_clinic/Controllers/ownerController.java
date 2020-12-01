package springframework.spfpet_clinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ownerController {
    @RequestMapping({"/owners","/owners/index","/owner/intex.html"})
    public  String ownerList(){
        return "owner/index";

    }
}
