package com.gateway.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; 

//@Configuration 
//@EnableWebFluxSecurity

public class SecurityConfiguration {
    
 
	 /*
    @Bean
    public SecurityWebFilterChain SecurityWebFilterChain(ServerHttpSecurity httpSecurity) throws Exception {
          httpSecurity
        	.authorizeExchange(exchanges -> exchanges.anyExchange().authenticated())
             .oauth2Login(Customizer.withDefaults())
            .csrf(csrf -> csrf.disable());
        
        return httpSecurity.build();
    } */
    /*
    
    @Bean
    public SecurityWebFilterChain SecurityWebFilterChaind(ServerHttpSecurity httpSecurity) {
        httpSecurity.authorizeExchange(exchanges -> exchanges.anyExchange().authenticated())
                .oauth2Login(Customizer.withDefaults());
        httpSecurity.csrf().disable();
        
        return httpSecurity.build();
    }*/
}