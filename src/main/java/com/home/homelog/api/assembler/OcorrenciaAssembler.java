package com.home.homelog.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.home.homelog.api.model.OcorrenciaModel;
import com.home.homelog.domain.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class OcorrenciaAssembler {
	private ModelMapper modelMapper;

	public OcorrenciaModel toModel(Ocorrencia ocorrencia) {
		return modelMapper.map(ocorrencia, OcorrenciaModel.class);
	}

	public List<OcorrenciaModel> toCollectionModel(List<Ocorrencia> ocorrencias) {
		return ocorrencias.stream().map(this::toModel).collect(Collectors.toList());
	}

}
