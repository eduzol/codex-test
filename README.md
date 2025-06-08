# Greeting Service

This project is a small Spring Boot microservice built with Java 24 and Spring Boot 3.5.0. It exposes a single HTTP endpoint `/greeting` that accepts a `name` parameter and returns a JSON greeting.

## Running

```
./mvnw spring-boot:run
```

## Example

```
curl "http://localhost:8080/greeting?name=Codex"
```

This should return:

```
{"message":"hello world Codex"}
```
