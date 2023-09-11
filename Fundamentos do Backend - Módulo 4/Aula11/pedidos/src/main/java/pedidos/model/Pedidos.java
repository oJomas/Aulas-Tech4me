package pedidos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import pedidos.shared.PedidosCompletoDTO;

@Document("/pedidos")
public class Pedidos {
    @Id
    private String id;
    private String nomeCliente;
    private Pizza idPizza;
    private Double valor;



    public Pedido(PedidosCompletoDTO pedidoDto){
        pedidoDto.setNomeCliente(nomeCliente);
        pedidoDto.setValor;
        
    }


    public Pedidos(PedidosCompletoDTO pedidoDto) {
        pedidoDto.setNomeCliente(nomeCliente);
        pedidoDto.setValor(valor);
        this.idPizza = idPizza;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Pizza getIdPizza() {
        return idPizza;
    }
    public void setIdPizza(Pizza idPizza) {
        this.idPizza = idPizza;
    }



    
}
