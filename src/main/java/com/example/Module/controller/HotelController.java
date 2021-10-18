package com.example.Module.controller;
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

import com.example.Module.sevice.HotelService;

import com.example.Module.Entity.Hotel;



@RestController
@RequestMapping(value="/hotel")
public class HotelController 
{
	@Autowired
	private HotelService hotelService;
	
	@PostMapping(value="/save")
  public ResponseEntity<Hotel> saveHotel(@Valid @RequestBody Hotel hotel)
	{
		return new ResponseEntity<Hotel>(hotelService.addHotel(hotel),HttpStatus.CREATED);
	}
	
	@PutMapping(value="/{hid}")
	public ResponseEntity<Hotel> updateHotel(@PathVariable Integer hid,@RequestBody Hotel hotel)
	{
	Hotel updatedHotel=hotelService.updateHotel(hotel,hid);
		return new ResponseEntity<Hotel>(updatedHotel,HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/{hid}")
	public ResponseEntity<String> removeHotel(@PathVariable Integer hid)
	{
	hotelService.deleteHotel(hid);
		String msg = "Hotel with Id "+hid+" Deleted Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping(value="/showAllHotel")
	public ResponseEntity<List<Hotel>> showAllHotel()
	{
		List<Hotel> allHotel = hotelService.showAllHotel();
		return new ResponseEntity<List<Hotel>>(allHotel,HttpStatus.OK);
	}
	
	@GetMapping(value="/{hid}")
	public ResponseEntity<Hotel> getHotel(@PathVariable Integer hid)
	{
		Hotel hotelById =hotelService.showHotel(hid);
		return new ResponseEntity<Hotel>(hotelById,HttpStatus.OK);
	}

}