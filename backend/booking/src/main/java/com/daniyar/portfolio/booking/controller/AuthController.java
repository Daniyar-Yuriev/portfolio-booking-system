package com.daniyar.portfolio.booking.controller;

import com.daniyar.portfolio.booking.security.JwtUtil;
import com.daniyar.portfolio.booking.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {
    private final BookingService bookingService;

    public AuthController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> request) {

        String username = request.get("username");
        String password = request.get("password");

        if ("admin".equals(username) && "1234".equals(password)) {
            String token = JwtUtil.generateToken(username);
            return Map.of("token", token);
        }

        throw new RuntimeException("Invalid credentials");
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(
            @PathVariable Long id,
            @RequestHeader("Authorization") String token) {

        // remove Bearer
        token = token.replace("Bearer ", "");

        // verify
        String user = JwtUtil.validateToken(token);

        bookingService.deleteBooking(id);

        return "Deleted by " + user;
    }
}