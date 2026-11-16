# Fintech Microservices Platform

A Java 21 and Spring Boot microservices project for a fintech backend, organised as a multi-module Maven build with independent services for accounts, payments and fraud detection, behind a Spring Cloud Gateway API gateway.

The project is a learning and portfolio project. Its goal is to practise service boundaries, REST API design, persistence, caching and automated testing in a distributed backend. The sections below state clearly what is implemented, what is only structured, and what is planned.

## Target architecture


                      API Gateway
                  (Spring Cloud Gateway)
                           |
          +----------------+----------------+
          |                |                |
   Account Service   Payment Service   Fraud Service
          |                |                |
      PostgreSQL       PostgreSQL       PostgreSQL
          \                |                /
                          Redis


This diagram shows the intended design. Not every connection in it is implemented yet (see Current status).

## Current status

**Implemented**
- Multi-module Maven project with four independent Spring Boot modules: `account-service`, `payment-service`, `fraud-service` and `gateway`.
- Integration test confirming that the Account Service application context starts against a PostgreSQL Testcontainer.

**Structured, business logic in progress**
- Account Service: account creation, retrieval, lookup by customer ID and validation.
- Payment Service: payment creation, validation and persistence.
- Fraud Service: rule-based analysis of payment transactions.
- API Gateway: routing of client requests to the services.
- Redis caching for account and fraud-related data.
- REST communication between the Payment Service and the Account and Fraud services.

**Planned**
- Complete payment processing workflow and payment idempotency.
- Risk scoring and more advanced fraud rules.
- JWT authentication and role-based access control.
- Circuit breakers and retries, centralised configuration, service discovery.
- Event-driven communication with Kafka.
- Observability (OpenTelemetry, Prometheus, Grafana).
- Kubernetes and Google Cloud Platform deployment, CI/CD pipelines.
- Wider automated test coverage.

## Technology stack

- Java 21
- Spring Boot 4.1.1 (Web, Data JPA, Actuator)
- Spring Cloud Gateway
- PostgreSQL
- Redis
- Maven (multi-module)
- Docker
- JUnit and Testcontainers

## Project structure

```text
fintech-microservices-platform/
├── services/
│   ├── account-service/
│   ├── payment-service/
│   ├── fraud-service/
│   └── gateway/
├── pom.xml
└── README.md
```

## Testing

The current test suite verifies that the Account Service application context starts successfully with a PostgreSQL Testcontainer. Further unit and integration tests are planned for each service.

## Author

Halimatou Diallo
