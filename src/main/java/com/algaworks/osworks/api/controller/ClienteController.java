package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("joao sdasd");
		cliente.setEmail("gmail");
		cliente.setTelefone("321");
		var cliente1 = new Cliente(2L, "joa", "gmai", "324");
		var cliente2 = new Cliente(3L, "jo", "gma", "325");
		
		return Arrays.asList(cliente, cliente1, cliente2);
	}
}
