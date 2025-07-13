package dev.java10x.CadastroDeNinjas.Ninjas;

import java.util.List;

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

   
}
