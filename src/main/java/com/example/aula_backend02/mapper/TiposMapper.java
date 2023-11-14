package com.example.aula_backend02.mapper;

import com.example.aula_backend02.dto.TiposDTO;
import com.example.aula_backend02.model.Tipos;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TiposMapper {
    TiposMapper INSTANCE = Mappers.getMapper(TiposMapper.class);
    TiposDTO toDto(Tipos t);
    Tipos toModel(TiposDTO t);
}
