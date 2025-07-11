package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class NinjaController {

    @GetMapping("/mensagem")
    public String boasVindas(){
        return "Essa é minha primeira mensagem";
    }
}
