package br.com.tech4me.pedidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.tech4me.pedidos.service.PedidosService;
import br.com.tech4me.pedidos.shared.PedidosDTO;
import br.com.tech4me.pedidos.shared.PedidosCompletoDTO;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    private PedidosService servico;
    
    //CREAT
    @PostMapping
    public ResponseEntity<PedidosCompletoDTO> cadastrarPedido
    (@RequestBody PedidosCompletoDTO pedidoDto){
        return new ResponseEntity<>(servico.cadastrarPedido(pedidoDto)
        , HttpStatus.CREATED);
    }

    //READ
    @GetMapping
    private ResponseEntity<List<PedidosCompletoDTO>> obterTodos(){
        return new ResponseEntity<>(servico.obterTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<PedidosDTO> obterPorId(@PathVariable String id){
        if(servico.obterPorId(id).isPresent()){
            return new ResponseEntity<>(servico.obterPorId(id).get(),
            HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
