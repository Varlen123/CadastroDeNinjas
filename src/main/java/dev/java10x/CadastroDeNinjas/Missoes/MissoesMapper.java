package dev.java10x.CadastroDeNinjas.Missoes;

public class MissoesMapper {
    public MissoesModel map(MissoesDTO missoesDTO) {
        MissoesModel missoes = new MissoesModel();

        missoes.setId(missoesDTO.getId());
        missoes.setNome(missoesDTO.getNome());
        missoes.setDificuldade(missoesDTO.getDificuldade());

        return missoes;

    }

    public MissoesDTO map(MissoesModel missoesModel) {
        MissoesDTO missoesDTO = new MissoesDTO();

        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setNome(missoesModel.getNome());
        missoesDTO.setDificuldade(missoesModel.getDificuldade());

        return missoesDTO;
    }
}
