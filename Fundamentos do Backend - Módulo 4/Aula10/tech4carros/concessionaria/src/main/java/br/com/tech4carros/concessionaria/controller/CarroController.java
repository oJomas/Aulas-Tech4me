package br.com.tech4carros.concessionaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4carros.concessionaria.model.Carro;
import br.com.tech4carros.concessionaria.service.CarrosService;
import br.com.tech4carros.concessionaria.shared.CarroCompletoDTO;
import br.com.tech4carros.concessionaria.shared.CarroDTO;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarrosService servicos;

    @GetMapping
    public ResponseEntity<List<CarroDTO>> obterTodosCadastrados(){
        return new ResponseEntity<>(servicos.obterTodos(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<CarroCompletoDTO> obterPorId(@PathVariable Integer id){
        Optional<CarroCompletoDTO> carro = servicos.obterPorId(id);

        if(carro.isPresent()){
            return new ResponseEntity<>(carro.get(), HttpStatus.OK);
        }
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        

    }
    
}
