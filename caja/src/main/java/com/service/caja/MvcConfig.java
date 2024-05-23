package com.service.caja;

import java.util.Locale;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
   
import org.springframework.web.servlet.config.annotation.CorsRegistry; 
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 @Configuration
public class MvcConfig implements WebMvcConfigurer {
	
  
	 /*
	  
	@Bean
    public WebMvcConfigurer corsConfigurer() { 
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/v1/**")
                	
                //"https://172.18.02"
                 .allowedOrigins( "http://192.168.32.11:4200" ) // CAMBIAR CON DOMINIO DEL FRONTEND
                 .allowedMethods("GET","POST","PUT","DELETE");
	           	  //.allowedHeaders("*")
	           	//.exposedHeaders("Authorization")
	           	//.allowCredentials(false)
	           	 //.maxAge(3600);
            }
        };
    } */
	
	 
}
