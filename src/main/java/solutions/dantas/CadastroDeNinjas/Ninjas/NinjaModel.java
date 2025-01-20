package solutions.dantas.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import solutions.dantas.CadastroDeNinjas.Missoes.MissoesModel;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;


    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
