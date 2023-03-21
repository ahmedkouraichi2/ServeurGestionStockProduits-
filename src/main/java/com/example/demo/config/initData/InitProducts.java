package com.example.demo.config.initData;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.model.Produit;
import com.example.demo.repository.ProduitRepository;


@Component
@Order(3)
public class InitProducts implements ApplicationRunner {
	
	
	    
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Init Products .....");

	       
	}
    
}