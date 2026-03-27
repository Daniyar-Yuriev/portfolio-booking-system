# portfolio-booking-system
Simple booking system built with WordPress and Spring Boot.

**Booking System (WordPress + Spring Boot)**
**Overview**
    This project is a simple booking system built with WordPress and Spring Boot.
    The frontend is implemented using WordPress with custom HTML and JavaScript,
    and the backend provides RESTful APIs using Spring Boot.
**Features**
    Create booking
    View booking list
    Delete booking
    REST API integration with WordPress
    Docker-based deployment
**Architecture**
    WordPress → Spring Boot API → MySQL
    　　　　　　↓
    　　　　　Nginx (Reverse Proxy)
**Tech Stack**
    Java 17
    Spring Boot
    MySQL
    WordPress
    Docker
    Nginx
**How to Run**
    docker-compose up -d --build
**API Endpoints**
    POST /api/bookings
    GET /api/bookings
    DELETE /api/bookings/{id}
**Notes**
    This project was created to practice full-stack development and deployment.
    I focused on building a simple and stable system structure.
**Author**
    Daniyar Yuriev
