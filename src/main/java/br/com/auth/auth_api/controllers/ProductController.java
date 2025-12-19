package br.com.auth.auth_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @PostMapping
    public ResponseEntity<String> createProduct(){
        return ResponseEntity.ok("Sucesso: Apenas ADMs veem isso!");
    }

    @GetMapping
    public ResponseEntity<String> getAllProducts(){
        return ResponseEntity.ok("Sucesso: Lista de produtos para todos os usuários logados.");
    }
}