package com.example.montadora;

import com.example.montadora.domain.TipoAdicionalEnum;
import com.example.montadora.domain.Veiculo;
import com.example.montadora.domain.Adicionais;
import com.example.montadora.repository.VeiculoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MontadoraApplication implements CommandLineRunner {
    private static VeiculoRepository repository;

    public MontadoraApplication(final VeiculoRepository repository) {
        this.repository = repository;
    }


    public static void main(String[] args) {
        SpringApplication.run(MontadoraApplication.class, args);
    }

    static void insertVeiculos() {

        repository.insert(Veiculo.builder()
                .nome("Pulse")
                .fabricadoEm(LocalDateTime.now())
                .portas(4)
                .potencia(1.6)
                .opcionais(List.of(Adicionais.builder()
                                        .nome("Roda de liga leve")
                                        .tipoAdicional(TipoAdicionalEnum.ACABAMENTO)
                                        .build(),
                                Adicionais.builder()
                                        .nome("Multimidia")
                                        .tipoAdicional(TipoAdicionalEnum.ENTRETENIMENTO)
                                        .build(),
                                Adicionais.builder()
                                        .nome("Ar condicionado")
                                        .tipoAdicional(TipoAdicionalEnum.INTERNO)
                                        .build()
                        )
                ).build());

        repository.insert(Veiculo.builder()
                .nome("Fast Back")
                .fabricadoEm(LocalDateTime.now())
                .portas(4)
                .potencia(1.6)
                .opcionais(List.of(Adicionais.builder()
                                        .nome("Roda de liga leve")
                                        .tipoAdicional(TipoAdicionalEnum.ACABAMENTO)
                                        .build(),
                                Adicionais.builder()
                                        .nome("Multimidia")
                                        .tipoAdicional(TipoAdicionalEnum.ENTRETENIMENTO)
                                        .build(),
                                Adicionais.builder()
                                        .nome("Ar condicionado")
                                        .tipoAdicional(TipoAdicionalEnum.INTERNO)
                                        .build(),
                                Adicionais.builder()
                                        .nome("Camera de re")
                                        .tipoAdicional(TipoAdicionalEnum.EXTERNO)
                                        .build()
                        )
                ).build());

        repository.insert(Veiculo.builder()
                .nome("Mobi")
                .fabricadoEm(LocalDateTime.now())
                .portas(4)
                .potencia(1.6)
                .opcionais(List.of(Adicionais.builder()
                                        .nome("Ar condicionado")
                                        .tipoAdicional(TipoAdicionalEnum.INTERNO)
                                        .build(),
                                Adicionais.builder()
                                        .nome("Sensor de estacionamento")
                                        .tipoAdicional(TipoAdicionalEnum.EXTERNO)
                                        .build()
                        )
                ).build());
    }

    @Override
    public void run(String... args) throws Exception {
        insertVeiculos();
    }
}


