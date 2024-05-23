package com.service.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;
 

@SpringBootApplication 
public class ClienteApplication {
 
 
	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
		
			String password = "12345"; 
			//"$2a$10$JHeCzhvY9j2kp1wy8qwn7.AsvkyCzXeGG5pV9HcBzvRoMRTGp9PI2";
		
		for(int i=0; i<2; i++) {
			String bcryptPassword = new BCryptPasswordEncoder().encode(password);
			System.out.println("bcryptPassword"); 
			System.out.println(bcryptPassword); 
		} 
	}
	 

}
