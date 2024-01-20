package com.springboot.ecom.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class Security {
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			http
			   .authorizeHttpRequests(auth ->
			   		auth
					   .requestMatchers("/shop/**","/checkout","/cart","/h2-console/**")
					   .hasAnyRole("ADMIN","USER")
					   .requestMatchers("/admin/**")
					   .hasRole("ADMIN")
					   .requestMatchers("/register","/","/productImages/**")
					   .permitAll()
					   .anyRequest()
					   .authenticated())
			   .formLogin(login -> 
			   		login
			   			.loginPage("/login")
			   			.loginProcessingUrl("/login")
			   			.failureUrl("/login?error=true")
			   			.defaultSuccessUrl( "/" )
			   			.permitAll())
						.logout(logout -> 
					logout
						.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
						.logoutSuccessUrl("/login")
						.invalidateHttpSession(true)
						.deleteCookies("JSESSIONID"))
						.csrf()
						.disable();
		
				http.headers().frameOptions().disable();
				return http.build();
		
	}
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		
		UserDetails harsh=User.builder()
				.username("harsh")
				.password(passwordEncoder().encode("123"))
				.roles("USER")
				.build();
		
		UserDetails shreya=User.builder()
				.username("shreya")
				.password(passwordEncoder().encode("123"))
				.roles("USER")
				.build();
		
		UserDetails rajat=User.builder()
				.username("rajat")
				.password(passwordEncoder().encode("123"))
				.roles("USER")
				.build();
		
		UserDetails awanish=User.builder()
				.username("awanish")
				.password(passwordEncoder().encode("123"))
				.roles("ADMIN","USER")
				.build();
		
		return new InMemoryUserDetailsManager(harsh, shreya , rajat, awanish);
	}
	
	
	

}
