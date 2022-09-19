package com.example.OpenFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OpenFeign.OpenFeignApplication.CepService;


@RestController
public class IndexController {

	@Autowired
	private CepService cepService;	
	
	@RequestMapping("cep")
	public String getEndereco() {				
		return cepService.getEnderecoPorCep("01001000");	
	}
	
	
}
