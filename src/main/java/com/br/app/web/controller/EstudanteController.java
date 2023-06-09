package com.br.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.app.web.model.Estudante;
import com.br.app.web.service.EstudanteService;

@Controller
public class EstudanteController {

	@Autowired
	private EstudanteService service;

	@GetMapping({ "/estudantes", "/" })
	public String ListarEstudante(Model modelo) {
		modelo.addAttribute("estudantes", service.listarTodosEstudantes());
		return "estudantes"; // retorna arquivo de estudante
	}

	@GetMapping("/estudantes/novo")
	public String mostrarFormularioRegistroEstudante(Model modelo) {
		Estudante estudante = new Estudante();
		modelo.addAttribute("estudante", estudante);
		return "inserir_estudante";
	}

	@PostMapping("/estudantes") //@ModelAttribute - permite salvar o objeto "estudante"
	public String guardarEstudante(@ModelAttribute("estudante") Estudante estudante) {
		service.salvarEstudante(estudante);
		return "redirect:/estudantes";
	}

	// mostrar o formulario para editar o estudante. A partir do id eu busco o
	// estudante para edição
	@GetMapping("/estudantes/editar/{id}")
	public String mostrarFormularioEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("estudante", service.obterEstudantePorId(id));
		return "editar_estudante";
	}

	@PostMapping("/estudantes/{id}")
	public String atualizarEstudante(@PathVariable Long id, @ModelAttribute("estudante") Estudante estudante,
			Model modelo) {
		Estudante estudanteExistente = service.obterEstudantePorId(id);
		 estudanteExistente.setNome(estudante.getNome());
		 estudanteExistente.setApelido(estudante.getApelido());
		 estudanteExistente.setEmail(estudante.getEmail());
		service.atualizarEstudante(estudanteExistente, id);
			return "redirect:/estudantes";
		

	}

	@GetMapping("/estudantes/{id}")
	public String deletarEstudante(@PathVariable Long id) {
	  service.deletarEstudante(id);
	  return "redirect:/estudantes";
}
}
