package com.service.caja;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 
 
 
@SpringBootApplication  
public class CajaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CajaApplication.class, args);
		
		String password = "12345"; 
		//"$2a$10$JHeCzhvY9j2kp1wy8qwn7.AsvkyCzXeGG5pV9HcBzvRoMRTGp9PI2";
	
	for(int i=0; i<2; i++) {
		String bcryptPassword = new BCryptPasswordEncoder().encode(password);
		System.out.println("bcryptPassword"); 
		System.out.println(bcryptPassword); 
		//$2a$10$xsG3LNozSHWujb64wsPfG.0VsqJPcs.t0l9EY3E2.DSlxOqYygVDO
	} 
	}

}
