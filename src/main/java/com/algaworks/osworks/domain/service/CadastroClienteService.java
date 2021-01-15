package com.algaworks.osworks.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.osworks.domain.model.Cliente;
import com.algaworks.osworks.domain.repository.ClienteRepository;
import com.algaworks.osworks.doman.expection.NegocioException;

@Service
public class CadastroClienteService {
	
	@Autowired
	private ClienteRepository rep;
	
	public Cliente salvar(Cliente cliente) {
		Cliente clienteExistente = rep.findByEmail(cliente.getEmail());
		
		if (clienteExistente != null && !clienteExistente.equals(cliente)) {
			throw new NegocioException("Ja existe um cliente um papapa");
		}
		
		return rep.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		rep.deleteById(clienteId);
	}
}
