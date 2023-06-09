package com.br.app.web.service;

import java.util.List;

import com.br.app.web.model.Estudante;

public interface EstudanteService {
	
	public List<Estudante> listarTodosEstudantes();
	
	public Estudante salvarEstudante(Estudante estudante);
	
	public Estudante obterEstudantePorId(Long id);
	
	public Estudante atualizarEstudante(Estudante estudante, Long id);
	
	public void  deletarEstudante(Long id);

}
