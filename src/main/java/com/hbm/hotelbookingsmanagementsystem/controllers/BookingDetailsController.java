package com.hbm.hotelbookingsmanagementsystem.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hbm.hotelbookingsmanagementsystem.entites.BookingDetails;
import com.hbm.hotelbookingsmanagementsystem.services.IBookingDetailsService;

@RestController
@RequestMapping(value = "/bookingdetails/")
public class BookingDetailsController {

	@Autowired
	private IBookingDetailsService bookingService;

	@PostMapping(value = "/bookingdetails/save")
	public ResponseEntity<BookingDetails> addBookingDetails(@Valid @RequestBody BookingDetails bookingDetails) {
		BookingDetails addDetails = bookingService.addBookingDetails(bookingDetails);
		return new ResponseEntity<BookingDetails>(addDetails, HttpStatus.CREATED);
	}

	@PutMapping(value = "/{booking_id}")
	public ResponseEntity<BookingDetails> updateBookingDetails(@PathVariable Integer booking_id,
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestBody BookingDetails bookingDetails) {
		BookingDetails updatedDetails = bookingService.updateBookingDetails(booking_id, bookingDetails);
		return new ResponseEntity<BookingDetails>(updatedDetails, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/{booking_id}")
	public ResponseEntity<String> removeBookingDetails(@PathVariable Integer booking_id) {
		bookingService.removeBookingDetails(booking_id);
		String msg = "Details with " + booking_id + " Deleted Sucessfully";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping(value = "/showAllBookings")
	public ResponseEntity<List<BookingDetails>> showAllBookingDetails() {
		List<BookingDetails> displayAll = bookingService.showAllBookingDetails();
		return new ResponseEntity<List<BookingDetails>>(displayAll, HttpStatus.OK);
	}

	@GetMapping(value = "/{booking_id}")
	public ResponseEntity<BookingDetails> showBookingDetails(@PathVariable Integer booking_id) {
		BookingDetails booking = bookingService.showBookingDetails(booking_id);
		return new ResponseEntity<BookingDetails>(booking, HttpStatus.OK);
	}
}
