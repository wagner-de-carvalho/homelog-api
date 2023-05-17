package com.home.homelog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.homelog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setEmail("joao@mail.com");
		cliente1.setTelefone("2733335454");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setEmail("maria@mail.com");
		cliente2.setTelefone("3545458789");
		var cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setNome("Carlos");
		cliente3.setEmail("charles@mail.com");
		cliente3.setTelefone("2184569712");
		
		
		return Arrays.asList(cliente1, cliente2, cliente3);
	}

}
