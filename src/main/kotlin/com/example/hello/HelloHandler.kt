package com.example.hello

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.awaitPrincipal
import org.springframework.web.reactive.function.server.bodyValueAndAwait

@Component
class HelloHandler(
    private val service: HelloService
) {

    suspend fun hello(
        request: ServerRequest
    ) = ok().bodyValueAndAwait(
        service.hello()
    )

    @PreAuthorize("isAuthenticated()")
    suspend fun securedHello(
        request: ServerRequest
    ) = ok().bodyValueAndAwait(
        service.securedHello(request.awaitPrincipal())
    )
}