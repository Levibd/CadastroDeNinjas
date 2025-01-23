package solutions.dantas.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha mensagem nessa rota";
    }

    // Adicionar Ninja
    @PostMapping("/create")
    public String criarNinja(){
        return "Ninja created!";
    }


    // Procurar Ninja por ID
    @GetMapping("/allId")
    public String mostrarNinjasId(){
        return "Ninja by ID";
    }


    // Mostrar todos os ninjas
    @GetMapping("/all")
    public String mostrarNinjas(){
        return "Todos os ninjas";
    }

    // Alterar dados dos ninjas
    @PutMapping("/alter")
    public String alterarNinjaId(){
        return "Ninja altered!";
    }


    // Deletar Ninja
    @DeleteMapping("/delete")
    public String deleteId(){
        return "Ninja deleted!";
    }
}
