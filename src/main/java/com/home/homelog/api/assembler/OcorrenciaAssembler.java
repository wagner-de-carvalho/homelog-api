package com.home.homelog.api.assembler;

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

}
