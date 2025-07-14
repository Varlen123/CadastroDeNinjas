package dev.java10x.CadastroDeNinjas.Ninjas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {
    
    @Autowired //inicializa um construtor 
    private NinjaRepository ninjaRepository;

    //Listar todos os meus ninjas

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

   //Listar ninjas por ID

   public NinjaModel listarNinjasPorId(Long id){
    Optional <NinjaModel> ninjaPorId = ninjaRepository.findById(id);
    return ninjaPorId.orElse(null);
   }

   //Criar um novo ninja
   public NinjaModel criarNinja (NinjaModel ninja){
    return ninjaRepository.save(ninja);
   }

   //Deletar um ninja por ID - método void
   public void deletarNinjaPorId(Long id){
         ninjaRepository.deleteById(id);
   }

}
