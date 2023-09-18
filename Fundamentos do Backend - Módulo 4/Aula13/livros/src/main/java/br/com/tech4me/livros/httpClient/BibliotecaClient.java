package br.com.tech4me.livros.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.livros.model.Biblioteca;

@FeignClient("Biblioteca")
public interface BibliotecaClient {
    
    @RequestMapping(method = RequestMethod.GET, value = "/livros/{id}")
    Biblioteca obterLivroPorId(@PathVariable String id);

    @RequestMapping(method = RequestMethod.PUT, value = "/livros/{id}")
    Biblioteca atualizarLivro(@PathVariable String id, @RequestBody Biblioteca biblioteca);

    @RequestMapping(method = RequestMethod.POST, value = "/livros/{id}")
    Biblioteca cadastrarLivro(@RequestBody Biblioteca biblioteca);

    @RequestMapping(method = RequestMethod.DELETE, value = "/livros/{id}")
    Biblioteca excluirPorId(@PathVariable String id);
}
