package com.gestao.viatura.viatura.service;

import com.gestao.viatura.viatura.domain.dto.ModeloRequestDTO;
import com.gestao.viatura.viatura.domain.dto.ModeloResponseDTO;
import com.gestao.viatura.viatura.mapper.ModeloMapper;
import com.gestao.viatura.viatura.repository.ModeloRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@AllArgsConstructor
public class SalvarModeloService implements Function<ModeloRequestDTO, ModeloResponseDTO> {

    private final ModeloRepository repository;

    @Override
    public ModeloResponseDTO apply(ModeloRequestDTO modelo) {
     return ModeloMapper.MAPPER.toDto(repository.save(ModeloMapper.MAPPER.toEntity(modelo)));
    }
}
