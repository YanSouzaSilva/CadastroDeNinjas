package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado.";
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjaPorId(){
        return "Exibir o ninja pelo ID.";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public String mostrarTodosOsNinja(){
        return "Exibir todos os ninjas.";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorId(){
        return "Alterar ninja por ID.";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletar")
    public String deletarNinjaPorId(){
        return "Ninja deletado por ID.";
    }

}
