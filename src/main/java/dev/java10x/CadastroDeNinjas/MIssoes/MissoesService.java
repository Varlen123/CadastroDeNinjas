package dev.java10x.CadastroDeNinjas.MIssoes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class MissoesService {
    @Autowired
    private MissoesRepository missoesRepository;

    //Criar as missões
    public MissoesModel criarMissoes(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }

    //Listar todas as missões por id

    public MissoesModel missoesPorId(Long id){
        Optional <MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }

    //Deletar missoes por id
    public void MissoesModel(Long id){
        missoesRepository.deleteById(id);
    }

    //Listar todas as missões

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }
}