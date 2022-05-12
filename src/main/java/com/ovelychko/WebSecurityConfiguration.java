package com.ovelychko;

//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableOAuth2Sso
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/", "/index", "/error")
                .permitAll()
                .anyRequest()
                .authenticated();

//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/", "/index", "/error").permitAll() // Allow this for all
//                .anyRequest().authenticated()
//                .and().logout().logoutSuccessUrl("/").permitAll()
//                .and()
//                .oauth2Login();

//        http.authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login();
    }
}
