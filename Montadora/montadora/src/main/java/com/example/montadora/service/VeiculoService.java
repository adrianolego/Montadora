package com.example.montadora.service;

import com.example.montadora.domain.Veiculo;
import com.example.montadora.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class VeiculoService {

    private final VeiculoRepository repository;
    public List<Veiculo> findVeiculos() {
        return repository.findAll();
    }
}