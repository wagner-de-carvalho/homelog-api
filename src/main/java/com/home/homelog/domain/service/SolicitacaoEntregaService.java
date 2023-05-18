package com.home.homelog.domain.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.homelog.domain.model.Entrega;
import com.home.homelog.domain.model.StatusEntrega;
import com.home.homelog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {

	private EntregaRepository entregaRepository;
	private CatalogoClienteService clienteService;

	@Transactional
	public Entrega solicitar(Entrega entrega) {
		var cliente = clienteService.buscar(entrega.getCliente().getId());
				
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(LocalDateTime.now());
		
		return entregaRepository.save(entrega);
	}
}
