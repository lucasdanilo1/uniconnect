package uniceplac.webdev.uniconnect.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @GetMapping()
    public String home(){
        return "home";
    }

    @GetMapping("projetos")
    public String projetos(){
        return "projetos";
    }

    @GetMapping("atendimento-ao-publico")
    public String formularioAtendimento(){
        return "cadastro-atendimento-ao-publico";
    }

}
