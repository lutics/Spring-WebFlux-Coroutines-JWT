package com.example.config

import com.example.hello.HelloHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class RouterConfig {

    @Bean
    fun helloRouter(handler: HelloHandler) = coRouter {
        GET("/hello", handler::hello)
        GET("/secured/hello", handler::securedHello)
    }
}