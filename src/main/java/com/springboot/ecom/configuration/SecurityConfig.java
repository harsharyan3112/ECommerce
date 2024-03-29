////package com.springboot.ecom.configuration;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.config.annotation.web.builders.WebSecurity;
////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.web.SecurityFilterChain;
////import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
////import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
////import com.springboot.ecom.service.CustomUserDetailService;
////
////
////@EnableWebSecurity
////@Configuration
////public class SecurityConfig{
////	
////	@Autowired
////	GoogleOAuth2SuccessHandler googleOAuth2SuccessHandler;
////	
////	@Autowired
////	CustomUserDetailService customUserDetailService;
////	
////	 @Bean
////	 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////		 http
////			.authorizeRequests()
////			.antMatchers("/","/shop/**","/register","/h2-console/**").permitAll()
////			.antMatchers("/admin/**").hasRole("ADMIN")
////			.anyRequest()
////			.authenticated()
////			.and()
////			.formLogin()
////			.loginPage("/login")
////			.permitAll()
////			.failureUrl("/login?error=true")
////			.defaultSuccessUrl("/")
////			.usernameParameter("email")
////			.passwordParameter("password")
////			.and()
//////			.oauth2Login()
//////			.loginPage("/login")
//////			.successHandler(googleOAuth2SuccessHandler)
//////			.and()
//////			.logout()
//////			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//////			.logoutSuccessUrl("/login")
//////			.invalidateHttpSession(true)
//////			.deleteCookies("JSESSIONID")
//////			.and()
//////			.exceptionHandling()
//////			.and()
////			.csrf()
////			.disable();
////
////		http.headers().frameOptions().disable();
////		return http.build();
////
////	}
////
////    @Bean
////    BCryptPasswordEncoder bCryptPasswordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
////	
////	
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
////		auth.userDetailsService(customUserDetailService);
////	}
////
////	@Bean
////	public WebSecurityCustomizer webSecurityCustomizer() {
////	    return (web) ->web.ignoring().antMatchers("/resources/**","/static**","/images**","/productImages**");
////	}
////}
//
//
