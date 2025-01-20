package solutions.dantas.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import solutions.dantas.CadastroDeNinjas.Missoes.MissoesModel;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(unique = true)
    private String email;

    private int idade;


    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
