package br.com.tech4carros.concessionaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4carros.concessionaria.model.Carro;
import br.com.tech4carros.concessionaria.repository.CarrosRepository;
import br.com.tech4carros.concessionaria.shared.CarroCompletoDTO;
import br.com.tech4carros.concessionaria.shared.CarroDTO;


@Service
public class CarrosServiceImpl implements CarrosService {

    @Autowired
    private CarrosRepository repositorio;


    @Override
    public List<CarroDTO> obterTodos() {
        List<CarroDTO> todosCarros = repositorio.findAll().stream().map(c -> CarroDTO.fromCarro(c)).toList();
        return todosCarros;
    }

    @Override
    public Optional<CarroCompletoDTO> obterPorId(Integer id) {
        Optional<Carro> carro = repositorio.findById(id);
        if(carro.isPresent()){
            return Optional.of(CarroCompletoDTO.fromCarro(carro.get()));
        }
        return Optional.empty();
    }

    @Override
    public CarroDTO cadastrarCarro(CarroCompletoDTO carroDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarCarro'");
    }
    

}
