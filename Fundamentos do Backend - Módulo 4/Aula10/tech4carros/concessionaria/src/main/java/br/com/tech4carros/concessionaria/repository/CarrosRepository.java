package br.com.tech4carros.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tech4carros.concessionaria.model.Carro;

@Repository
public interface CarrosRepository extends JpaRepository <Carro, Integer> {
    
}
