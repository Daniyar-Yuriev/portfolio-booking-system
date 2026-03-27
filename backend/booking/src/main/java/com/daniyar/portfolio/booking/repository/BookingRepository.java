package com.daniyar.portfolio.booking.repository;

import com.daniyar.portfolio.booking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}