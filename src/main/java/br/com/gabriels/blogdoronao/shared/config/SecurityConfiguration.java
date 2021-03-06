package br.com.gabriels.blogdoronao.shared.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/posts/new").hasRole("ADMIN")
                .antMatchers("/*").permitAll()
                .antMatchers("/posts/detail/**").permitAll()
                .and().formLogin().loginPage("/login").failureUrl("/login?error=true").defaultSuccessUrl("/posts")
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout=true")
                .and().httpBasic()
                .and().csrf().disable();
    }
}
