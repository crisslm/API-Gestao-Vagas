package com.br.cristian.gestao_vagas.modules.controller;


import com.br.cristian.gestao_vagas.modules.models.Candidate;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@Valid @RequestBody Candidate candidate){
        System.out.println("Candidate: ");
        System.out.println(candidate.getEmail());
    }
}
