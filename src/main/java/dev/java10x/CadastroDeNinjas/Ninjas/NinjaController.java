package dev.java10x.CadastroDeNinjas.Ninjas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ninjas")
@RestController
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    //Adicionar ninja(CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "ninja criado";
    }
    //Buscar ninja por id(READ)

    @GetMapping("/listar")
      public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
      }

    //Mostrar todos os ninjas (READ)

     @GetMapping("/listar/{id}")
      public NinjaModel listarNinjasPorId(@PathVariable Long id){
      return ninjaService.listarNinjasPorId(id);
    }
    
    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorID(){
        return "Atualizar ninjas por ID";
    }
    //Deletar ninja (DELETE)

    @DeleteMapping("/deletar")
    public String deletarNinjaPorId(){
        return "Ninja deletado";
    }
}
