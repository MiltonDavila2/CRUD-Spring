package com.crud.app;

import com.crud.app.repositorio.TrabajadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}


	@Autowired
	private TrabajadorRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*Trabajador trabajador1 = new Trabajador("Milton", "Davila", "miltonandres");
		repositorio.save(trabajador1);

		Trabajador trabajador2 = new Trabajador("Milton", "avila", "midsdsadddltonandres");
		repositorio.save(trabajador2);*/
	}
}
