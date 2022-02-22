package com.reinaldo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reinaldo.domain.Cliente;
import com.reinaldo.domain.enums.TipoCliente;
import com.reinaldo.repositories.ClienteRepository;

@SpringBootApplication
public class ProjetoClienteApplication implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienteRepository;
		
	public static void main(String[] args) {
		SpringApplication.run(ProjetoClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cli1 = new Cliente(null, "Reinaldo", "naldos15@hotmail.com", "03859968211", TipoCliente.PESSOAFISICA);   
		
		clienteRepository.save(cli1);
	}

}