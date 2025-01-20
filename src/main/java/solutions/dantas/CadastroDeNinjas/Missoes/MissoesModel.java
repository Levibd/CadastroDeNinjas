package solutions.dantas.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import solutions.dantas.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;
    private String rank;


    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

    public MissoesModel(){

    }

    public MissoesModel(String nomeMissao, String rank, List<NinjaModel> ninja) {
        this.nomeMissao = nomeMissao;
        this.rank = rank;
        this.ninja = ninja;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public List<NinjaModel> getNinja() {
        return ninja;
    }

    public void setNinja(List<NinjaModel> ninja) {
        this.ninja = ninja;
    }
}
