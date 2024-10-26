package ru.maliutin.basicauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    @Order(1)
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                // Использование стандартной страницы аутентификации
                .formLogin(Customizer.withDefaults())
                .authorizeHttpRequests(
                        auth ->
                                // Требование аутентификации для доступа к энпоинту /protect
                                auth.requestMatchers("/protect/**").authenticated()
                                // Свободный доступ ко всем остальным эндпоинтам
                                .anyRequest().permitAll())
                .build();
    }
}
