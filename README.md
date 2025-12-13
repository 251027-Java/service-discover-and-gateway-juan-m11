# Lab: Spring Cloud Gateway

## Goal
Set up an API Gateway that routes traffic to your Eureka Client.

## Pre-requisites
-   Running Eureka Server (from Demo).
-   Running Eureka Client (Application Name: `MY-CLIENT`).

## Requirements (Starter Code Provided)
1.  **Dependencies**: `spring-cloud-starter-gateway`, `spring-cloud-starter-netflix-eureka-client`.
2.  **Config**:
    -   Register Gateway with Eureka.
    -   Configure routes in `application.yml`.
3.  **Route Definition**:
    -   Path: `/client/**`
    -   URI: `lb://MY-CLIENT` (Use Load Balancer URI).
4.  **Test**:
    -   Hit `http://localhost:8080/client/hello`.
    -   Ensure it forwards to the Client Service.

## Starter Code
-   `GatewayApp.java` is provided as a stub.
