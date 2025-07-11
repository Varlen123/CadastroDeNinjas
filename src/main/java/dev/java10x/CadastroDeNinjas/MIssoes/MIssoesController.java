package dev.java10x.CadastroDeNinjas.MIssoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MIssoesController {
    
    @GetMapping("/missoes")
    public String boasVindas(){
        return "Missões disponíveis";
    }
}
