package br.com.tech4carros.concessionaria.shared;

import br.com.tech4carros.concessionaria.model.Carro;

public record CarroDTO(Integer id, String marca, String modelo) {
    
    public static CarroDTO fromCarro(Carro carro){
        return new CarroDTO(carro.getId(), carro.getMarca(), carro.getModelo());
    }
}
