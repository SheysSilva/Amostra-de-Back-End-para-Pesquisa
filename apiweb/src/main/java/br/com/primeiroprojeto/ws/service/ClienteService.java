package br.com.primeiroprojeto.ws.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeiroprojeto.ws.modulo.Cliente;
import br.com.primeiroprojeto.ws.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	//metodos 
	public Cliente cadastrar(Cliente cliente) {
		
		return this.clienteRepository.save(cliente);
	}
	
	public Collection<Cliente> buscarTodos(){
		return this.clienteRepository.findAll();
	}
	
	 
	public void excluirID(Integer id) {
		this.clienteRepository.delete(id);			
 
	}
	
	public Cliente buscaPorId(Integer id) {
		return this.clienteRepository.findOne(id);
	}
	
	public Cliente alterar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}	

}
