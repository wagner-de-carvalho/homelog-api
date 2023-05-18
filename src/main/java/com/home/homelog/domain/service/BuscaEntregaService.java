package com.home.homelog.domain.service;

import org.springframework.stereotype.Service;

import com.home.homelog.domain.exception.EntidadeNaoEncontradaException;
import com.home.homelog.domain.model.Entrega;
import com.home.homelog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;

	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId).orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}

}
