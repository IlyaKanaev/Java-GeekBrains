package com.example.gateway.filter;

import com.example.gateway.service.JwtService;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class JwtVerificationFilter extends
        AbstractGatewayFilterFactory<JwtVerificationFilter.Config> {

    private final JwtService jwtService;

    public JwtVerificationFilter(JwtService jwtService) {
        super(Config.class);
        this.jwtService = jwtService;
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            var headers = exchange.getRequest().getHeaders();
            var authHeader = headers.getFirst(HttpHeaders.AUTHORIZATION);

            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                var token = authHeader.substring(7);
                if (jwtService.verifyToken(token)) {
                    return chain.filter(exchange);
                }
            }

            return handleUnauthorized(exchange);
        };
    }

    private Mono<Void> handleUnauthorized(ServerWebExchange exchange) {
        final var responseBody = "UNAUTHORIZED";

        var response = exchange.getResponse();
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        response.getHeaders().setContentType(MediaType.APPLICATION_JSON);

        var dataBuffer = response.bufferFactory().wrap(responseBody.getBytes());

        return response.writeWith(Mono.just(dataBuffer));
    }

    public static class Config {

    }
}

