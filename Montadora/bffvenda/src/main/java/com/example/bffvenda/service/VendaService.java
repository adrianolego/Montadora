package com.example.bffvenda.service;

import com.example.bffvenda.domain.Veiculo;
import com.example.bffvenda.remote.VendaClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class VendaService {

    private final VendaClient client;

    public List<Veiculo> getVeiculos() {
        return client.getVeiculos();
    }
}
