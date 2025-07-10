package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.MIssoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Entity trasnforma uma classe em uma entidade do banco de dados
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;
    
    private int idade;
    
    
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreign key
    private MissoesModel missoes;
    
}
