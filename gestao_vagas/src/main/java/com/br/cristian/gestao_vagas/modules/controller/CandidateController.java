package com.br.cristian.gestao_vagas.modules.controller;


import com.br.cristian.gestao_vagas.modules.exception.UserFoundException;
import com.br.cristian.gestao_vagas.modules.models.Candidate;
import com.br.cristian.gestao_vagas.modules.repository.CandidateRepository;
import com.br.cristian.gestao_vagas.modules.service.CandidateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody Candidate candidateEntity){
        try{
            var result =  this.candidateService.createCandidate(candidateEntity);
            return ResponseEntity.ok().body(result);
        } catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
