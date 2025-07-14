package dev.java10x.CadastroDeNinjas.MIssoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //Listar todas as missões
    @GetMapping("/lista")
    public List<MissoesModel> listaMissoes(){
        return missoesService.listarMissoes();
    }

    
    //Listar missões por id
    @GetMapping("/missoesId/{id}")
    public MissoesModel MissoesId(@PathVariable Long id){
        return missoesService.missoesPorId(id);
    }
    //Deltar Missoes
    @DeleteMapping("/deletarMissaoPorId/{id}")
    public void deletarPorId (@PathVariable Long id){
      missoesService.deletarMissaoPorId(id);;
    }
}