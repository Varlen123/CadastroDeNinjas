package dev.java10x.CadastroDeNinjas.Ninjas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ninjas")
@RestController
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/mensagem")
    public String boasVindas(){
        return "Essa é minha primeira mensagem";
    }

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

     @GetMapping("/todosporId")
    public String mostrarTodosOsNinjasPorId(){
        return "id dos ninjas";
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
