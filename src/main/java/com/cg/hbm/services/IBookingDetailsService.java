package com.cg.hbm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hbm.entites.BookingDetails;

@Service
public interface IBookingDetailsService {

	BookingDetails addBookingDetails(BookingDetails bookingDetails);

	BookingDetails updateBookingDetails(Integer booking_id, BookingDetails bookingDetails);

	void removeBookingDetails(Integer booking_id);

	List<BookingDetails> showAllBookingDetails();
	
	BookingDetails showBookingDetails(Integer booking_id);

}
