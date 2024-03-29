package com.example.montadora.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Adicionais {

    private String nome;

    private TipoAdicionalEnum tipoAdicional;
}
