package br.com.tech4produtos.produtos.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4produtos.produtos.demo.model.Produtos;

public interface ProdutosRepository extends MongoRepository<Produtos, String> {
    
}
