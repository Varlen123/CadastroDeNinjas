package dev.java10x.CadastroDeNinjas.Missoes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class MissoesService {
    @Autowired
    private MissoesRepository missoesRepository;
    private MissoesMapper missoesMapper;

    //Criar as missões
    public MissoesDTO criarMissoes(MissoesDTO missoesDTO){
        MissoesModel missoesModel = missoesMapper.map(missoesDTO);
        missoesModel = missoesRepository.save(missoesModel);
        return missoesMapper.map(missoesModel);
    }

    //Listar as missões por id

    public MissoesDTO missoesPorId(Long id){
        Optional <MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.map(missoesMapper::map).orElse(null);
    }

    //Deletar missoes por id
    public void deletarMissaoPorId(Long id){
        missoesRepository.deleteById(id);
    }

    //Listar todas as missões

    public List<MissoesDTO> listarMissoes(){
        List<MissoesModel> missoes = missoesRepository.findAll();
        return missoes.stream()
                .map(missoesMapper::map)
                .collect(Collectors.toList());
    }
    //Atualizar missoes
        public MissoesDTO atualizarMissoes(Long id, MissoesDTO missoesDTO){
            Optional<MissoesModel> missaoExistente = missoesRepository.findById(id);
            if(missaoExistente.isPresent()){
                MissoesModel missoesAtualizado = missoesMapper.map(missoesDTO);
                missoesAtualizado.setId(id);
                MissoesModel missoesSalvo = missoesRepository.save(missoesAtualizado);
                return missoesMapper.map(missoesSalvo);
            }
            return null;
    }
}