package com.example.demo.config.initData;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.model.Role;
import com.example.demo.model.RoleEnum;
import com.example.demo.repository.RoleRepository;

@Order(1)
@Component
public class InitRoles  implements ApplicationRunner {
	 private final RoleRepository roleRepository;
	public InitRoles(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }
	
	

	@Override
    public void run(ApplicationArguments args) throws Exception {
      
    }

}
