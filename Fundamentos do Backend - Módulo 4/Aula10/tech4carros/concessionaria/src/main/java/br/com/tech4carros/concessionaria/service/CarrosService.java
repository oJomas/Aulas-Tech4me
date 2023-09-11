package br.com.tech4carros.concessionaria.service;

import java.util.List;
import java.util.Optional;


import br.com.tech4carros.concessionaria.shared.CarroCompletoDTO;
import br.com.tech4carros.concessionaria.shared.CarroDTO;

public interface CarrosService {
    
    List<CarroDTO> obterTodos();
    Optional<CarroCompletoDTO> obterPorId(Integer id);
    CarroDTO cadastrarCarro(CarroCompletoDTO carroDto);

    
}
