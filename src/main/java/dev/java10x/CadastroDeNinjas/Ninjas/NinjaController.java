package dev.java10x.CadastroDeNinjas.Ninjas;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    final private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO ninjaDTO = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja criado com sucesso: " + ninjaDTO.getNome() + "(ID): " + ninjaDTO.getId());
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    // Mostrar ninja  por id (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id) {
            NinjaDTO ninja = ninjaService.listarNinjasPorId(id);
            if(ninja != null){
                return ResponseEntity.ok(ninja);
            }else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado");
            }
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        NinjaDTO ninja = ninjaService.atualizarNinja(id, ninjaAtualizado);
        if (ninja != null) {
            return ResponseEntity.ok(ninja);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja nao encontrado");
        }
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
   public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id) {
    if (ninjaService.listarNinjasPorId(id) != null) {
        ninjaService.deletarNinjaPorId(id);
        return ResponseEntity.ok("Ninja deletado com sucesso");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("O ninja com o id " + id + " não foi encontrado");
    }
}
 }

