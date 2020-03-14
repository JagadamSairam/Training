package com.cts.training.zuulserver.netflixzuulapigatewayserver;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource dataSource;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable()
		.authorizeRequests()
        .antMatchers("/").permitAll() 
        .antMatchers("/user-service/**").permitAll()
        .antMatchers("/user-service/activate").permitAll()
        .antMatchers("/user-service/login").permitAll()
       
//        .antMatchers("/user-service/**").access("hasRole('USER') or hasRole('ADMIN')")
        
        .antMatchers("/company-service/company/**").hasAnyRole("USER","ADMIN")
        .antMatchers("/company-service/**").hasAnyRole("USER,ADMIN")
        .antMatchers("/initial-public-offering-service/ipo/**").hasAnyRole("USER","ADMIN")
        .antMatchers("/initial-public-offering-service/**").hasAnyRole("USER,ADMIN")
        .antMatchers("/stock-exchange-service/stocks/**").hasAnyRole("USER","ADMIN")
        .antMatchers("/stock-exchange-service/**").hasAnyRole("USER,ADMIN")
        .antMatchers("/stock-price-service/**").hasAnyRole("USER,ADMIN")

//        .antMatchers("/user-service/company-by-users/").hasAnyRole("USER","ADMIN")
        
        
//        .antMatchers("/stock-price-service/stockprice/**").hasAnyRole("USER","ADMIN")
//        .antMatchers("/stock-price-service/stockPrices/uploadStockSheet/**").hasAnyRole("USER","ADMIN")
        
                
//        .antMatchers("/stock-price-service/**").hasAnyRole("USER,ADMIN")
//		.antMatchers("/user-service/**").access("hasRole('USER')")
        .and()
      	.httpBasic();
    }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication()
		.usersByUsernameQuery("select username,password,active from register_users where username=?")
		.authoritiesByUsernameQuery("select username,usertype from register_users where username=?")
		.dataSource(dataSource)
		.passwordEncoder(new PasswordEncoder() {
			
			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				// TODO Auto-generated method stub
				return rawPassword.equals(encodedPassword);
			}
			
			@Override
			public String encode(CharSequence rawPassword) {
				// TODO Auto-generated method stub
				return rawPassword.toString();
			}
		});
		
	}
	
	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource sourceUrl= new UrlBasedCorsConfigurationSource();
		CorsConfiguration con= new CorsConfiguration();
		con.setAllowCredentials(true);
		con.addAllowedOrigin("*");
		con.addAllowedHeader("*");
		con.addAllowedMethod("OPTIONS");
		con.addAllowedMethod("GET");
		con.addAllowedMethod("POST");
		con.addAllowedMethod("PUT");
		con.addAllowedMethod("DELETE");
		sourceUrl.registerCorsConfiguration("/**", con);
		return new CorsFilter(sourceUrl);
	}

	
}
