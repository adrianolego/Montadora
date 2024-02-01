package com.example.bffvenda.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Veiculo {
    private String id;
    private String nome;
    private LocalDateTime fabricadoEm;
    private Double potencia;
    private Integer portas;
    private List<Adicionais> opcionais;
}
