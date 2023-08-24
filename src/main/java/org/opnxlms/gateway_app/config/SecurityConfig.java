 package org.opnxlms.gateway_app.config;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
 import org.springframework.security.config.web.server.ServerHttpSecurity;
 import org.springframework.security.web.server.SecurityWebFilterChain;

 import static org.springframework.security.config.Customizer.withDefaults;

 @Configuration
 @EnableWebFluxSecurity
 public class SecurityConfig {

     @Bean
     public SecurityWebFilterChain springSecurityWebFilterChain(ServerHttpSecurity http) {
         http
                 .authorizeExchange(exchanges -> exchanges
                                 .pathMatchers("/").permitAll()
                                 .pathMatchers("/actuator/**").permitAll()
                                 .pathMatchers("/*.*").permitAll()
                                 .pathMatchers("/api/authenticate").permitAll()
                                 .pathMatchers("/api/register").permitAll()
                                 .pathMatchers("/api/activate").permitAll()
                                 .pathMatchers("/api/account/reset-password/init").permitAll()
                                 .pathMatchers("/api/account/reset-password/finish").permitAll()
                                 .pathMatchers("/api/**").authenticated()
                                 .pathMatchers("/services/**").authenticated()
                                 .pathMatchers("/management/health").permitAll()
                                 .pathMatchers("/management/health/**").permitAll()
                                 .pathMatchers("/management/info").permitAll()
                                 .pathMatchers("/management/prometheus").permitAll()
                 )
                 .oauth2Login(withDefaults());

         return http.build();
     }
 }






