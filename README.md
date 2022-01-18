# Spring WebFlux + Coroutines + Corouter + JWT

Webflux + Coroutines(+Corouter) 서버 베이스에 JWT 연동 샘플

- 사전준비

    Spring Authorization Server [예제](https://github.com/lutics/Spring-Authorization-Server-On-GCP-AppEngine)를 준비한다

    완성 된 서버의 JWKS 주소를 application.properties 에 추가한다

```
spring.security.oauth2.resourceserver.jwt.jwk-set-uri=[JWKS 주소]
```

- 일반적인 호출 예제

```
curl "http://localhost:8080/hello"
```

- 보안이 적용 된 URL 호출 시 예제

```
curl "http://localhost:8080/secured/hello" \
-H 'Authorization: Bearer [Access Token(JWT)]'
```
