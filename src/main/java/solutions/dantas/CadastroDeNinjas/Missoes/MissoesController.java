package solutions.dantas.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missões")
public class MissoesController {

    @GetMapping("/listar")
    public String mostrarMissoes(){
        return "Missões mostradas com sucesso!";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada com sucesso!";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso!";
    }

    @DeleteMapping("/deletar")
    public String deleteMission(){
        return "Missão deletada com sucesso!";
    }
}
