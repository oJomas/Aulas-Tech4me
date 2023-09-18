package br.com.tech4me.pedidos.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.pedidos.model.Pizza;


@FeignClient("pizzaria")
public interface PizzariaClient {
    
    @RequestMapping(method = RequestMethod.GET, value = "/pizzas/{id}")
    Pizza obterPizzaPorId(@PathVariable String id);

    @RequestMapping(method = RequestMethod.PUT, value = "/pizzas/{id}")
    void atualizarPizza(@PathVariable String id, @RequestBody Pizza pizza);
}
