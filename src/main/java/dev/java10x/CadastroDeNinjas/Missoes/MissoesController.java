package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // Adicionar missao (CREATE)
    // POST -- Mandar(postar) uma requisicao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso.";
    }

    // Mostrar todas as missoes (READ)
    // GET -- Pegar uma requisicao para mostrar as missoes
    @GetMapping("/listar")
    public String mostrarMissao(){
        return "Mostrando todas missoes.";
    }

    // Alterar dados das missoes por ID (UPDATE)
    // PUT -- Manda uma requisicao para alterar uma das missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso.";
    }

    // Deletar missao por ID (DELETE)
    //DELETE -- Manda uma requisicao para deletar uma das missoes
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso.";
    }

}
