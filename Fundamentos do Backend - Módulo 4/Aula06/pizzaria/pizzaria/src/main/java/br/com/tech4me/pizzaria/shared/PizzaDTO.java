package br.com.tech4me.pizzaria.shared;

import java.util.List;

public record PizzaDTO(String id, String sabor,
                         List<String> ingredientes) {
    
}
