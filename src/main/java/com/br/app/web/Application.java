package com.br.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.app.web.model.Estudante;
import com.br.app.web.repository.EstudanteRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private EstudanteRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
	 /*Estudante estudante1 = new Estudante("Vanessa", "DArc", "vanessadarc@gamil.com");
	 repository.save(estudante1);
		/*	
		
	 Estudante estudante2 = new Estudante("Gustavo", "Gu", "gu@gamil.com");
	 repository.save(estudante2);
	 
	 Estudante estudante3 = new Estudante("Junior", "Ju", "ju@gamil.com");
	 repository.save(estudante3);
	 
		*/
	}

	
}
