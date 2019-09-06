package com.study.bankprocess.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{

	//basic auth
	//is there any passwordEncoder present then java.lang.IllegalArgumentException: There is no PasswordEncoder mapped for the id "null"
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
		    .withUser("admin").password(passwordEncoder().encode("admin123")).roles("ADMIN")//declare password enconder as a bean is not enough you need to encode the password also
		    .and()
		    .withUser("arup").password(passwordEncoder().encode("1234")).roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		  //  .anyRequest()//this means any request of any page need to be authenticated regardless of his role
		 //   .authenticated()
		    .antMatchers("/bank/login").permitAll()
		    .antMatchers("/bank/wihdrawl").authenticated()
		   .antMatchers("/bank/createaccount").hasRole("USER")
		    .and()
		    .httpBasic();
	}
	
	@Bean
	PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder(); 
	}
	
}
