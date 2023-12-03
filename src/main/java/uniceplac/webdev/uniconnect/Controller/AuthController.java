package uniceplac.webdev.uniconnect.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class AuthController {

    @GetMapping("cadastro")
    public String formularioCadastro(){
        return "paginaCadastro";
    }

    @GetMapping("login")
    public String formularioLogin() {
        return "paginaLogin";
    }

}
