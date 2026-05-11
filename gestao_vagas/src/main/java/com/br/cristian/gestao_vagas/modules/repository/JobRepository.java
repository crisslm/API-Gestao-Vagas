package com.br.cristian.gestao_vagas.modules.repository;

import com.br.cristian.gestao_vagas.modules.models.Job;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import java.util.UUID;

public interface JobRepository extends JpaRepositoryImplementation<Job, UUID> {
}
