package com.example.demo.config.initData;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;

import com.example.demo.model.Role;
import com.example.demo.model.RoleEnum;
import com.example.demo.model.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;

import org.springframework.stereotype.Component;

@Order(2)
@Component

public class InitUsers  implements ApplicationRunner  {

	    private final UserRepository userRepository;
	    private final RoleRepository roleRepository;
	    
	    public InitUsers(UserRepository userRepository, RoleRepository roleRepository){
	        this.userRepository = userRepository;
	        this.roleRepository = roleRepository;
	    }
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Init User ........");
		
		   
	}

}
