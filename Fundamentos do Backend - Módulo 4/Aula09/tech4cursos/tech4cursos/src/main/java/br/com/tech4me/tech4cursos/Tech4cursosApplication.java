package br.com.tech4me.tech4cursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tech4me.tech4cursos.telas.LoopPrincipal;

@SpringBootApplication
public class Tech4cursosApplication implements CommandLineRunner{

	@Autowired
	private LoopPrincipal loopPrincipal;

	public static void main(String[] args) {
		SpringApplication.run(Tech4cursosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		loopPrincipal.loop();
		System.exit(0);
	}

}
