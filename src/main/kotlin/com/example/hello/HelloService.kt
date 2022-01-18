package com.example.hello

import org.springframework.stereotype.Service
import java.security.Principal

@Service
class HelloService {

    fun hello() = "Hello??"

    fun securedHello(principal: Principal?) = "Hello!! ${principal?.name}"
}