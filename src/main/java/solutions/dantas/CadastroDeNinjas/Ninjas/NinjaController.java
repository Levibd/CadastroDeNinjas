package solutions.dantas.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha mensagem nessa rota";
    }

    // Adicionar Ninja
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja created!";
    }


    // Procurar Ninja por ID
    @GetMapping("/listarId")
    public String mostrarNinjasId(){
        return "Ninja by ID";
    }


    // Mostrar todos os ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Alterar dados dos ninjas
    @PutMapping("/alterar")
    public String alterarNinjaId(){
        return "Ninja altered!";
    }


    // Deletar Ninja
    @DeleteMapping("/deletarId")
    public String deleteId(){
        return "Ninja deleted!";
    }
}
