package br.com.tech4me.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.tech4me.model.Produtos;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {
    List<Produtos> produtos = new ArrayList<>();

    //Read
    //Get = obter valores / neste caso, todos cadastrados na lista
    @GetMapping
    private List<Produtos> obterProdutos(){
        return produtos;
    }

    //Obter produtos pelo (nome)
    @GetMapping("/{descricao}")
    private Produtos obterProdutoPorNome(@PathVariable String descricao){

        Produtos produto = produtos.stream()
        .filter(p -> p.getDescricao().equalsIgnoreCase(descricao))
        .findFirst().orElse(null);
        return produto;
    }   

    //Created
    //Post = adiciona valores / neste caso, recebe um objeto JSON
    @PostMapping
    private String cadastrarProdutos(@RequestBody Produtos produto){
        if(produto != null){
            produtos.add(produto);
            String mensagem = "Categoria: " + produto.getTipo() +
            "O produto " + produto.getDescricao() 
            + "foi cadastrado com sucesso!";
            return R
        }

        return "O produto está vazio!";
    }
    
    //Uptade
    //Atualiza valores - neste caso atualiza os produtos
    @PutMapping("/{descricao}")
    private Produtos atualizarPorProdutos(@PathVariable String descricao, @RequestBody Produtos produtoNovo){
        Produtos produto = produtos.stream()
         .filter(p -> p.getDescricao().equalsIgnoreCase(descricao))
         .findFirst().orElse(null);
        if(produto != null){
            produtos.add(produtos.indexOf(produto), produtoNovo);
        }

        return produto;

    }

    //Delete
   // @DeleteMapping-> Deletar um valor armazenado no repositório
    @DeleteMapping("/{descricao}")
    private void removerProduto(@PathVariable String descricao){
        produtos.removeIf(p -> p.getDescricao().equalsIgnoreCase(descricao));

    }
}
