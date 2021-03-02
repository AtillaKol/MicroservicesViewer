package ch.microservicesviewer.microservicesviewerbackend.configuration.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Dieser Klasse dient fuer gewisse Konfigurationen im Security. Wichtig, dieses Klasse wird nur im Profile
 * local genutzt.
 */
@Configuration
@Profile("local")
public class SecurityLocal extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable();
        httpSecurity.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/viewer").permitAll();
    }
}
