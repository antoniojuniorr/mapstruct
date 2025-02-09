package io.github.antoniojuniorr.mapstruct.entity;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioEntity {

    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dateExecute;
    private LocalDateTime dataCriacao;
}
