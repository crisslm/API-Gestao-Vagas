package com.br.cristian.gestao_vagas.modules.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class candidateController {

    @PostMapping("/")
    public void create(){

    }
}
