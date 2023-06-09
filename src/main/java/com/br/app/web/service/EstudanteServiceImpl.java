package com.br.app.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.app.web.model.Estudante;
import com.br.app.web.repository.EstudanteRepository;
@Service
public class EstudanteServiceImpl implements EstudanteService {
	
	@Autowired
	private EstudanteRepository repository;
	
	@Override
	public List<Estudante> listarTodosEstudantes() {
	
		return repository.findAll();
	}

	@Override
	public Estudante salvarEstudante(Estudante estudante) {
	  return repository.save(estudante);
	}

	@Override
	public Estudante obterEstudantePorId(Long id) {

		return repository.findById(id).get();
	}

	@Override
	public Estudante atualizarEstudante(Estudante estudante, Long id) {
	Optional<Estudante> resultEstudanteBD = 	repository.findById(id);
	if(resultEstudanteBD.isPresent()) {
		 Estudante estudanteBD = resultEstudanteBD.get();
		 estudanteBD.setNome(estudante.getNome());
		 estudanteBD.setApelido(estudante.getApelido());
		 estudanteBD.setEmail(estudante.getEmail());
		 return repository.save(estudanteBD);
	}else {
		return null;
	}
	}

	@Override
	public void deletarEstudante(Long id) {
		repository.deleteById(id);
		
	}

	

}
