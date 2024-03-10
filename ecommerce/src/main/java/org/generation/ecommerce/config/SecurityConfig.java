package org.generation.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
@EnableWebSecurity
public class SecurityConfig {//se puede llamar como sea, lo importante son las anotaciones

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception { //esta si se tiene que llamar así
		return http
				.csrf(csrf -> csrf.disable())
				.authorizeRequests(auth -> {
					auth.antMatchers("/").permitAll();
				})
				.httpBasic(withDefaults())
				.build();//esto desabilida el fomrulario inicial
	}//configure
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}//encoder
	
}//class SecurityConfig