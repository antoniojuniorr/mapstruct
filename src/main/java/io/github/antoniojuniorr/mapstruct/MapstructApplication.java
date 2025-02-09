package io.github.antoniojuniorr.mapstruct;

import io.github.antoniojuniorr.mapstruct.dto.UsuarioRecord;
import io.github.antoniojuniorr.mapstruct.dto.UsuarioRequest;
import io.github.antoniojuniorr.mapstruct.mapper.UsuarioMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class MapstructApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UsuarioMapper usuarioMapper) {
        return args -> {
            var usuarioRequest = UsuarioRequest
                    .builder()
                    .nome("Antonio")
                    .email("antonio@dev.com")
                    .senha("123")
                    .dataExecucao(LocalDateTime.now())
                    .build();

            var usuarioRecord = new UsuarioRecord(
                    "Antonio",
                    "antonio@dev.com",
                    "123",
                    LocalDateTime.now()
            );

            var usuarioEntityRequest = usuarioMapper.toEntity(usuarioRequest);
            var usuarioEntityRecord = usuarioMapper.toEntity(usuarioRecord);

            imprimirInformacoes("UsuarioRequest", usuarioRequest, usuarioEntityRequest);
            imprimirInformacoes("UsuarioRecord", usuarioRecord, usuarioEntityRecord);
        };
    }

    private void imprimirInformacoes(String tipo, Object request, Object entity) {
        System.out.println();
        System.out.println("### " + tipo + ":");
        System.out.println(tipo + ": " + request);
        System.out.println(tipo + " Entity: " + entity);
        System.out.println("### =========================== ###");
    }
}
