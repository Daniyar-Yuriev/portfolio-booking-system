Booking System (WordPress + Spring Boot)
📌 Overview

        This project is a full-stack booking system built with:
        
        Frontend: WordPress (Custom HTML + JavaScript)
        Backend: Spring Boot (REST API)
        Database: MySQL
        Deployment: AWS EC2 + Nginx + Docker
        
        Users can create bookings, and admins can manage them through a simple UI.

🚀 Features
        Create booking (POST API)
        View booking list (GET API)
        Delete booking (DELETE API)
        JWT Authentication for admin actions
        WordPress integration via REST API
        Responsive UI with JavaScript
        Docker-based deployment
🧱 Architecture

        User → WordPress → Spring Boot API → MySQL
        ↓
        Nginx (Reverse Proxy)

🛠️ Tech Stack
        Java 17
        Spring Boot
        MySQL
        WordPress
        Docker
        Nginx
        AWS EC2
⚙️ How to Run (Docker)
        docker-compose up -d --build
🔐 Authentication
        Login API: /api/auth/login
        JWT token required for DELETE operations
🌐 API Endpoints
        Method	Endpoint	Description
        POST	/api/bookings	Create booking
        GET	/api/bookings	Get all bookings
        DELETE	/api/bookings/{id}	Delete booking
📸 Screenshots



💡 Future Improvements
        Booking update feature
        Admin dashboard UI improvements
        Role-based authentication
        Email notifications
👨‍💻 Author

        Daniyar Yuriev
