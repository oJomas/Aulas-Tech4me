package pedidos.controller;

import java.util.List;
import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pedidos.service.PedidosService;
import pedidos.shared.PedidosCompletoDTO;
import pedidos.shared.PedidosDTO;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
    
    @Autowired
    private PedidosService servico;

    @PostMapping
    public ResponseEntity<PedidosCompletoDTO> cadastrarPedidos(@RequestBody PedidosCompletoDTO pedidos){
        return new ResponseEntity<>(servico.cadastrarPedido(pedidos), HttpStatus.SC_CREATED);
    }

    @GetMapping
    private ResponseEntity<List<PedidosCompletoDTO>> obterTodosOsPedidos(){
        return new ResponseEntity<>(servico.obterTodos(), HttpStatus.SC_CREATED);
    }

    @GetMapping("/{id}")
    private ResponseEntity<PedidosDTO> obterPedidosPorId(@PathVariable String id){
        if(servico.obterPorId(id).isPresent()){
            return new ResponseEntity<>(servico.obterPorId(id).get(), HttpStatus.SC_OK);
        }
    }


}
