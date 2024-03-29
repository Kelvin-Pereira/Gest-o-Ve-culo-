package com.gestao.viatura.viatura.mapper;

import com.gestao.viatura.viatura.domain.dto.ModeloRequestDTO;
import com.gestao.viatura.viatura.domain.dto.ModeloResponseDTO;
import com.gestao.viatura.viatura.domain.entity.Modelo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ModeloMapper {

    ModeloMapper MAPPER = Mappers.getMapper( ModeloMapper.class );

    Modelo toEntity(ModeloRequestDTO modeloRequestDTO);

    ModeloResponseDTO toDto(Modelo modelo);

}
