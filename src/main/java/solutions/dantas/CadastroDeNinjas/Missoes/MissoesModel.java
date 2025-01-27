package solutions.dantas.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import solutions.dantas.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;
    private String rank;


    @JsonIgnore
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}
