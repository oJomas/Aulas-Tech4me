package br.com.tech4me.tech4doces.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4doces.model.Produtos;
import br.com.tech4me.tech4doces.repository.ProdutosRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutosRepository repositorio;

    List<Produtos> produtos = new ArrayList<>();

    //READ

    //Get -> obter valores / neste caso, todos cadastrados na lista
    @GetMapping
    private List<Produtos> obterProdutos(){
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    private Produtos obterProdutoPorDescricao(@PathVariable String id){
        Produtos produto = repositorio.findById(id).orElse(null);

        return produto;
    }

    //CREATED
    //Post -> Adicionando valor / neste caso, recebe um objeto JSON
    @PostMapping
    private ResponseEntity<String> cadastrarProduto(@RequestBody Produtos produto){
        if (produto != null) {
            repositorio.save(produto);
            String mensagem = "Categoria: " + produto.getTipo() 
            + ". Produto: " + produto.getDescricao()
             + ". Foi cadastrado com sucesso";
            return new ResponseEntity<>(mensagem, HttpStatus.CREATED);
        }
        String mensagem = "O produto informado é nulo";
        return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
    }

    //UPDATE
    //Put -> Atualizar um valor existente / neste caso, recebe um identificador do objeto e um objeto JSON
    @PutMapping("/{id}")
    private ResponseEntity<Produtos> atualizarProduto(@PathVariable String id, 
                                        @RequestBody Produtos produtoNovo){
        Produtos produto = repositorio.findById(id).orElse(null);
        if (produto != null) {
            produto.setDescricao(produtoNovo.getDescricao());
            produto.setTipo(produtoNovo.getTipo());
            produto.setValor(produtoNovo.getValor());
            return new ResponseEntity<>(produto, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
    }

    //DELETE
    //DeleteMapping -> Deletar um valor armazenado no repositório
    @DeleteMapping("/{id}")
    private ResponseEntity<Void> removerProduto(@PathVariable String id){
        repositorio.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
