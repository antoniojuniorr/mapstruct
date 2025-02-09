package io.github.antoniojuniorr.mapstruct.dto;

import java.time.LocalDateTime;

public record UsuarioRecord(String nome, String email, String senha, LocalDateTime dataExecucao) {
}
