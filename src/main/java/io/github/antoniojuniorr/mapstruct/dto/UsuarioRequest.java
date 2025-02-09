package io.github.antoniojuniorr.mapstruct.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioRequest {

    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataExecucao;
}
