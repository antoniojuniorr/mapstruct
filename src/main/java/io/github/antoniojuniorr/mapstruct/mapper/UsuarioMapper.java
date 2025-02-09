package io.github.antoniojuniorr.mapstruct.mapper;

import io.github.antoniojuniorr.mapstruct.entity.UsuarioEntity;
import io.github.antoniojuniorr.mapstruct.dto.UsuarioRecord;
import io.github.antoniojuniorr.mapstruct.dto.UsuarioRequest;
import org.mapstruct.*;

import java.time.LocalDateTime;
import java.util.Random;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioMapper {

    @Mapping(target = "dateExecute", source = "dataExecucao")
    UsuarioEntity toEntity(UsuarioRequest usuarioRequest);

    @Mapping(target = "dateExecute", source = "dataExecucao")
    UsuarioEntity toEntity(UsuarioRecord usuarioRecord);

    @AfterMapping
    default void gerarDadosAfter(@MappingTarget UsuarioEntity.UsuarioEntityBuilder usuarioEntityBuilder) {
        usuarioEntityBuilder.id(new Random().nextInt(1000));
        usuarioEntityBuilder.dataCriacao(LocalDateTime.now());
    }
}
