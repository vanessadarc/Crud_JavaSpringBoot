package com.br.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.app.web.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

}
