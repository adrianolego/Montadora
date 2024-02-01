package com.example.montadora.controller;

import com.example.montadora.domain.Veiculo;
import com.example.montadora.service.VeiculoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
@AllArgsConstructor
public class VeiculoController {

    private final VeiculoService service;

    @GetMapping("/v1")
    public List<Veiculo> getVeiculo() {
        return service.findVeiculos();
    }
}
