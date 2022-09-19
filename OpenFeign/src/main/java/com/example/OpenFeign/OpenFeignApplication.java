package com.example.OpenFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@EnableFeignClients
public class OpenFeignApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignApplication.class, args);
	}
	
	
	@FeignClient(name = "viacep", url = "https://viacep.com.br/ws" )
	static interface CepService {

		@GetMapping("{cep}/json")
	    String getEnderecoPorCep(@PathVariable("cep") String cep);

	}
	
	@Autowired
	private CepService cepService;	
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Iniciando projeto .....");
		
		String resposta = cepService.getEnderecoPorCep("01001000");			
		
		System.out.println("Resposta da api viacep: ");
		
		System.out.println(resposta);
		
		
	}

}
