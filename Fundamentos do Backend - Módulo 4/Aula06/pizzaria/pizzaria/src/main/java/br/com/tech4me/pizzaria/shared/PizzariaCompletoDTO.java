package br.com.tech4me.pizzaria.shared;

import java.util.List;
import br.com.tech4me.pizzaria.model.Tamanho;

public record PizzariaCompletoDTO(  String id,
                                      String sabor,
                                      List<String> ingredientes,
                                      Tamanho tamanho,
                                      double valor) {
    
}
