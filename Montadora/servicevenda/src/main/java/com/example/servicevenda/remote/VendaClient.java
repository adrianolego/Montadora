package com.example.servicevenda.remote;

import com.example.servicevenda.config.RestProperties;
import com.example.servicevenda.domain.Veiculo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
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
