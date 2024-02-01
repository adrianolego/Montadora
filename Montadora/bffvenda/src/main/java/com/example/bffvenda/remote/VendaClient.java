package com.example.bffvenda.remote;

import com.example.bffvenda.config.RestProperties;
import com.example.bffvenda.domain.Veiculo;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Component
@AllArgsConstructor
public class VendaClient {

    private final RestTemplate restTemplate;
    private final RestProperties properties;

    public List<Veiculo> getVeiculos() {
        final var url = properties.getBaseUrl().concat(properties.getPath());
        return restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Veiculo>>() {
                }).getBody();
    }
}
