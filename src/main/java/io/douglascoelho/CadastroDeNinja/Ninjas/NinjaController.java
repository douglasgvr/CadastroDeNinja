package io.douglascoelho.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/home")
    public String Hello(){
        return "Seja Bem-vindo ao Site dos Ninjas";
    }
}
