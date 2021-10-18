package com.cg.hbm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.hbm.entites.BookingDetails;

public interface IBookingDetailsRepository extends JpaRepository<BookingDetails, Integer> {

}
