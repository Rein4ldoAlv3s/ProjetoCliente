package com.reinaldo;

import java.util.Arrays;

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
		Cliente cli1 = new Cliente(null, "Reinaldo", "teste@hotmail.com", "53458432423432", TipoCliente.PESSOAFISICA);  
		cli1.getTelefones().addAll(Arrays.asList("62993850194", "62991560025"));
		clienteRepository.save(cli1);
	}
}