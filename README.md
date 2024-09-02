# Microservices

![microservices](https://github.com/user-attachments/assets/3ad8061e-e2ac-4204-bdda-f76557ec384e)


Microservices Architecture with Eureka Server
This project demonstrates a microservices architecture implemented using Spring Cloud Netflix Eureka. It includes a discovery server (Eureka Server), a User Service, an Order Service, and an API Gateway service. The architecture is designed to handle service discovery, load balancing, and routing efficiently.

Project Structure
1. Eureka Server
The Eureka Server acts as a discovery server where all microservices register themselves. This enables service discovery and load balancing across multiple instances of services.

Directory: eureka-server
Port: 8761 (default)
Features:
Service registration and discovery
Dashboard for monitoring registered services
2. User Service
The User Service handles operations related to user management, such as creating, retrieving, updating, and deleting user information.

Directory: user-service
Port: 8086 (default)
Features:
RESTful API for user management
Service registration with Eureka Server
3. Order Service
The Order Service is responsible for managing orders, including creating new orders, viewing order details, and handling order lifecycle events.

Directory: order-service
Port: 8085 (default)
Features:
RESTful API for order management
Service registration with Eureka Server
4. API Gateway
The API Gateway acts as a single entry point to the microservices. It routes requests to the appropriate service and can handle additional concerns such as security, rate limiting, and cross-origin resource sharing (CORS).

Directory: api-gateway
Port: 8084 (default)
Features:
Routing to User Service and Order Service
Load balancing
Security and rate limiting (if configured)
![microservices](https://github.com/user-attachments/assets/709a686e-cd41-415b-8277-ad1e204561b3)
