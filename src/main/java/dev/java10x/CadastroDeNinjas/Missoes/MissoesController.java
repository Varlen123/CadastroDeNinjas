package dev.java10x.CadastroDeNinjas.Missoes;

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
    public MissoesDTO criarMissoes(@RequestBody MissoesDTO missoes){
        return missoesService.criarMissoes(missoes);
    }

    //Listar todas as missões
    @GetMapping("/lista")
    public List<MissoesDTO> listaMissoes(){
        return missoesService.listarMissoes();
    }

    
    //Listar missões por id
    @GetMapping("/missoesId/{id}")
    public MissoesDTO MissoesId(@PathVariable Long id){
        return missoesService.missoesPorId(id);
    }
    //Deltar Missoes
    @DeleteMapping("/deletarMissaoPorId/{id}")
    public void deletarPorId (@PathVariable Long id){
      missoesService.deletarMissaoPorId(id);;
    }
}