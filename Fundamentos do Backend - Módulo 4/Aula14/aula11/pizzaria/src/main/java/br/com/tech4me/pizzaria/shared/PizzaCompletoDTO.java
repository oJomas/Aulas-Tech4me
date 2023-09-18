package br.com.tech4me.pizzaria.shared;

import java.util.List;
import br.com.tech4me.pizzaria.model.Tamanho;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PizzaCompletoDTO(String id,
                            @NotEmpty(message = "Campo sabor deve ser informado.")
                            @NotBlank(message = "Está com caracteres em branco.")
                            String sabor,
                            List<String> ingredientes,
                            @NotNull(message = "Valores válidos: PEQ, MED, GRD ou GIG")
                            Tamanho tamanho,
                            @Positive(message = "O valor precisa ser um valor positivo.")
                            Double valor, 
                            @Positive(message = "O valor precisa ser maior que 0") 
                            int qtdEstoque) {

}
