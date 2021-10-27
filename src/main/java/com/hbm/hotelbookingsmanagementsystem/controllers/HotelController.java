package com.hbm.hotelbookingsmanagementsystem.controllers;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.hbm.hotelbookingsmanagementsystem.entites.Hotel;
import com.hbm.hotelbookingsmanagementsystem.services.IHotelService;

@RestController
@RequestMapping(value = "/hotel")

public class HotelController {
	@Autowired
	private IHotelService hotelService;

	@PostMapping(value = "/save")
	public ResponseEntity<Hotel> saveHotel(@Valid @RequestBody Hotel hotel) {
		return new ResponseEntity<Hotel>(hotelService.addHotel(hotel), HttpStatus.CREATED);
	}

	@PutMapping(value = "/{hotel_id}")
	public ResponseEntity<Hotel> updateHotel(@PathVariable Integer hotel_id, @RequestBody Hotel hotel) {
		Hotel updatedHotel = hotelService.updateHotel(hotel, hotel_id);
		return new ResponseEntity<Hotel>(updatedHotel, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/{hotel_id}")
	public ResponseEntity<String> removeHotel(@PathVariable Integer hotel_id) {
		hotelService.deleteHotel(hotel_id);
		String msg = "Hotel with Id " + hotel_id + " Deleted Successfully";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping(value = "/showAllHotel")
	public ResponseEntity<List<Hotel>> showAllHotel() {
		List<Hotel> allHotel = hotelService.showAllHotel();
		return new ResponseEntity<List<Hotel>>(allHotel, HttpStatus.OK);
	}

	@GetMapping(value = "/{hotel_id}")
	public ResponseEntity<Hotel> getHotel(@PathVariable Integer hotel_id) {
		Hotel hotelById = hotelService.showHotel(hotel_id);
		return new ResponseEntity<Hotel>(hotelById, HttpStatus.OK);
	}

}
