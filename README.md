# Fintech Microservices Platform

A production-oriented fintech microservices platform built with Java 21, Spring Boot, PostgreSQL, Redis, Docker, and Spring Cloud Gateway.

This project demonstrates the design and implementation of a distributed backend architecture for fintech applications, with independent services responsible for account management, payment processing, and fraud detection.

## Architecture

                         +---------------------+
                         |     API Gateway     |
                         | Spring Cloud Gateway|
                         +----------+----------+
                                    |
                 +------------------+------------------+
                 |                  |                  |
                 v                  v                  v
        +----------------+ +----------------+ +----------------+
        | Account Service | | Payment Service| | Fraud Service |
        +-------+--------+ +-------+--------+ +-------+--------+
                |                  |                  |
                v                  v                  v
        +----------------+ +----------------+ +----------------+
        |   PostgreSQL   | |   PostgreSQL   | |   PostgreSQL   |
        +----------------+ +----------------+ +----------------+
                |                  |                  |
                +------------------+------------------+
                                   |
                                   v
                            +-------------+
                            |    Redis    |
                            |    Cache    |
                            +-------------+

## Objectives

The main objective of this project is to demonstrate production-oriented backend engineering skills applicable to modern fintech systems.

The project focuses on:

- Microservice architecture
- Java backend development
- REST API design
- Payment processing
- Account management
- Fraud detection
- Data persistence
- Caching
- Service-to-service communication
- Automated testing
- Containerization
- Error handling
- Performance and scalability

## Technologies

- Java 21
- Spring Boot 4.1.1
- Spring Web
- Spring Data JPA
- Spring Cloud Gateway
- PostgreSQL
- Redis
- jOOQ
- Maven
- Docker
- Testcontainers
- Spock
- JUnit
- Mockito
- Spring Boot Actuator

## Microservices

### Account Service

Responsible for customer account management.

Responsibilities include:

- Creating customer accounts
- Retrieving accounts
- Finding accounts by customer ID
- Validating account data
- Persisting account information in PostgreSQL

### Payment Service

Responsible for payment processing.

Responsibilities include:

- Creating payment requests
- Validating payment data
- Processing transactions
- Handling payment errors
- Persisting payment information
- Preparing transactions for fraud analysis

### Fraud Service

Responsible for analyzing transactions and identifying potentially fraudulent activity.

Responsibilities include:

- Analyzing payment transactions
- Applying fraud detection rules
- Calculating risk information
- Using Redis for fast data access
- Persisting fraud analysis results

### API Gateway

The API Gateway provides a single entry point for external clients.

Responsibilities include:

- Routing requests to the appropriate microservice
- Centralizing access to backend services
- Providing a foundation for authentication and authorization
- Supporting a scalable distributed architecture

## Data Management

Each microservice follows a service-owned data approach.

### PostgreSQL

PostgreSQL is used for persistent transactional data, including:

- Customer accounts
- Payments
- Fraud analysis
- Business data

### Redis

Redis is used for low-latency data access and caching.

Potential use cases include:

- Frequently accessed account information
- Fraud detection data
- Risk-related data
- Reducing database load
- Improving response times

## Service Communication

The platform follows a distributed architecture where services communicate through REST APIs.

A typical payment flow is:

Client
|
v
API Gateway
|
v
Payment Service
|
+-------> Account Service
|
+-------> Fraud Service
|
v
Redis

This separation allows each service to have a clearly defined responsibility while remaining independently maintainable.

## Testing

Testing is an important part of the engineering approach.

The project uses:

- JUnit
- Spock
- Mockito
- Testcontainers
- Test-Driven Development (TDD)

Testcontainers is used to provide isolated PostgreSQL environments for integration testing.

The current test suite verifies that the Account Service application context starts successfully with a PostgreSQL Testcontainer.

## Docker

The architecture is designed to run as independent containerized services.

Docker can be used to package:

- Account Service
- Payment Service
- Fraud Service
- API Gateway
- PostgreSQL
- Redis

Containerization provides a consistent environment across development, testing, and deployment.

## Project Structure

fintech-microservices-platform/
|
+-- services/
|   |
|   +-- account-service/
|   |   +-- src/
|   |   +-- pom.xml
|   |
|   +-- payment-service/
|   |   +-- src/
|   |   +-- pom.xml
|   |
|   +-- fraud-service/
|   |   +-- src/
|   |   +-- pom.xml
|   |
|   +-- gateway/
|       +-- src/
|       +-- pom.xml
|
+-- src/
|   +-- main/
|       +-- java/
|
+-- pom.xml
+-- README.md

## Engineering Practices

The project is designed around backend engineering practices relevant to fintech systems:

- Clear service boundaries
- Separation of concerns
- RESTful API design
- Database persistence
- Caching strategies
- Automated testing
- Integration testing
- Containerization
- Error handling
- Performance optimization
- Observability
- Maintainable code structure

## Reliability and Error Handling

Financial systems require predictable behavior when failures occur.

The architecture is designed to support:

- Input validation
- Meaningful API errors
- Service-level error handling
- Database failure handling
- Resilient service communication
- Idempotent payment operations
- Transaction consistency

## Security

Security is a core consideration for a fintech backend.

Planned security improvements include:

- JWT authentication
- Role-based access control
- Service-to-service authentication
- API rate limiting
- Secure secret management
- Input validation and sanitization
- Audit logging

## Performance and Scalability

The platform is designed with scalability in mind.

Performance improvements include:

- Redis caching
- Efficient database access
- Service isolation
- Stateless REST services
- Database indexing
- Optimized queries
- Horizontal service scaling

## Future Improvements

Planned improvements include:

- Complete payment processing workflows
- Payment idempotency
- Distributed transaction handling
- Advanced fraud detection
- Risk scoring
- Event-driven communication with Kafka
- Centralized configuration
- Service discovery
- Circuit breakers and retry mechanisms
- OpenTelemetry
- Prometheus and Grafana
- Kubernetes deployment
- CI/CD pipelines
- Google Cloud Platform deployment
- Expanded Spock test coverage

## Portfolio Context

This project is part of a backend-focused fintech portfolio designed to demonstrate practical software engineering skills for Software Engineer and Backend Engineer opportunities.

It emphasizes Java 21, Spring Boot, microservices, REST APIs, PostgreSQL, Redis, testing, distributed systems, and production-oriented engineering practices.

## Author

Halimatou Diallo