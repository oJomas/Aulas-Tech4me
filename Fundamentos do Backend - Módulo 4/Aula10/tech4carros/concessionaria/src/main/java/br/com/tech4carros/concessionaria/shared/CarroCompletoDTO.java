package br.com.tech4carros.concessionaria.shared;

import br.com.tech4carros.concessionaria.model.Carro;

public record CarroCompletoDTO(Integer id, String marca, String modelo, Integer ano, Integer chassi) {
    
    public static CarroCompletoDTO fromCarro(Carro carro){
        return new CarroCompletoDTO(carro.getId(), carro.getMarca(), carro.getModelo(), carro.getAno(), carro.getChassi());
    }
}
