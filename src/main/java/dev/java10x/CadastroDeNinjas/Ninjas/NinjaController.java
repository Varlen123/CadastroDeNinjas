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
    public NinjaModel criaNinja(@RequestBody NinjaModel ninja){
      return ninjaService.criarNinja(ninja);

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
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjasPorID(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }
    //Deletar ninja (DELETE)

    @DeleteMapping("/deletarId/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }
}
