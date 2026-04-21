package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // Adicionar missao (CREATE)
    // POST -- Mandar(postar) uma requisicao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso.";
    }

    // Mostrar todas as missoes (READ)
    // GET -- Pegar uma requisicao para mostrar as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    // Mostrar missoes por ID(READ)
    // GET -- Pegar uma requisicao para mostrar missoes pelo ID
    @GetMapping("/listarId/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorId(id);
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
