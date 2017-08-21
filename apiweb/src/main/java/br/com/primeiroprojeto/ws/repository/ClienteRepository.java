package br.com.primeiroprojeto.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeiroprojeto.ws.modulo.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
