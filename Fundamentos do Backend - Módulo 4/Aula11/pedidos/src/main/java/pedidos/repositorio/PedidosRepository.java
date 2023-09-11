package pedidos.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import pedidos.model.Pedidos;

public interface PedidosRepository extends MongoRepository<Pedidos, String>{

}