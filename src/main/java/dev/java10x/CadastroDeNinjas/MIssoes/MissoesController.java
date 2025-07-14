package dev.java10x.CadastroDeNinjas.MIssoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/missoes")
@RestController
public class MissoesController {

    @Autowired
    private MissoesService missoesService;
    
    //Criar Missões
    @PostMapping("/criarMissoes")
    public MissoesModel criarMissoes(@RequestBody MissoesModel missoes){
        return missoesService.criarMissoes(missoes);
    }

    //D
}
