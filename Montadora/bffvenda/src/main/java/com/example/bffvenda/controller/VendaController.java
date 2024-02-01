package com.example.bffvenda.controller;

import com.example.bffvenda.domain.Veiculo;
import com.example.bffvenda.service.VendaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
@AllArgsConstructor
public class VendaController {

    private VendaService service;

    @GetMapping("/v1")
    public ResponseEntity<List<Veiculo>> getVeiculos() {
        return ResponseEntity.ok(service.getVeiculos());
    }

//    @GetMapping("/v2")
//    public void getVenda(){
//
//    }


}
