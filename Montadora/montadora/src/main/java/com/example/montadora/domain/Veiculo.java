package com.example.montadora.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Document("veiculo")
public class Veiculo {
    @MongoId
    private String id;
    private String nome;
    private LocalDateTime fabricadoEm;
    private Double potencia;
    private Integer portas;
    private List<Adicionais> opcionais;
}
