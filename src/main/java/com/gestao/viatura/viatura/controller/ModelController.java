package com.gestao.viatura.viatura.controller;

import com.gestao.viatura.viatura.domain.dto.ModeloRequestDTO;
import com.gestao.viatura.viatura.domain.dto.ModeloResponseDTO;
import com.gestao.viatura.viatura.service.SalvarModeloService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/modelo")
@RestController
@AllArgsConstructor
public class ModelController {

    private final SalvarModeloService salvarModeloService;

    @PostMapping
    public ResponseEntity<ModeloResponseDTO> salvarNovoModelo(@RequestBody ModeloRequestDTO modeloRequestDTO) {
        return ResponseEntity.ok(salvarModeloService.apply(modeloRequestDTO));
    }

    @GetMapping
    public List<?> buscarModelos() {
        return new ArrayList<>();
    }

    @DeleteMapping("/{id}")
    public void deletarModelo(@PathVariable Long id) {

    }


}
