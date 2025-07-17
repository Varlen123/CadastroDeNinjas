package dev.java10x.CadastroDeNinjas.Missoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaDTO;
@RequestMapping("/missoes")
@RestController
public class MissoesController {

    @Autowired
    private MissoesService missoesService;
    
    //Criar Missões
    @PostMapping("/criarMissoes")
    public ResponseEntity<String> criarMissoes(@RequestBody MissoesDTO missoes){
        MissoesDTO missoesDTO = missoesService.criarMissoes(missoes);
        return ResponseEntity.status(HttpStatus.CREATED).body("Missão criado com sucesso: " + missoesDTO.getNome() + "(ID): " + missoesDTO.getId());
    }

    //Listar todas as missões
    @GetMapping("/lista")
    public ResponseEntity<List<MissoesDTO>> listaMissoes(){
        List<MissoesDTO> missoes = missoesService.listarMissoes();
        return ResponseEntity.ok(missoes);
    }

    
    //Listar missões por id
    @GetMapping("/missoesId/{id}")
    public ResponseEntity<?> MissoesId(@PathVariable Long id){
          MissoesDTO missoesListaId = missoesService.missoesPorId(id);
            if( missoesListaId != null){
                return ResponseEntity.ok(missoesListaId);
            }else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão não encontrada");
            }
    }

    //Atualizar missões
    @PutMapping("/atualizarmissao/{id}")
    public ResponseEntity<String> atualizarMissoes(@PathVariable Long id, @RequestBody MissoesDTO missoes){
        MissoesDTO missoesAtualizado = missoesService.atualizarMissoes(id, missoes);
        if(missoesAtualizado != null){
            return ResponseEntity.status(HttpStatus.OK).body("Missão atualizado com sucesso");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão nao encontrado");
    }

    //Deltar Missoes
    @DeleteMapping("/deletarMissaoPorId/{id}")
    public ResponseEntity<String> deletarPorId (@PathVariable Long id){
     if(missoesService.missoesPorId(id) != null){
         missoesService.deletarMissaoPorId(id);
         return ResponseEntity.status(HttpStatus.OK).body("Missão deletado com sucesso");
     }
     return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão nao encontrado");
    }
}