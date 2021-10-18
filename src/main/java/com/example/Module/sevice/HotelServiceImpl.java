package com.example.Module.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Module.Entity.Hotel;
import com.example.Module.repo.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;

	@Override
		public Hotel addHotel(Hotel hotel) {
			return hotelRepository.save(hotel);
		}
@Override
	public Hotel updateHotel(Hotel hotel, Integer hid) {

		Optional<Hotel> existingHotel = hotelRepository.findById(hid);
		if (existingHotel.isPresent()) {
			Hotel hotel1 = existingHotel.get();
			hotel1.setCity(hotel.getCity());
			hotel1.setHname(hotel.getHname());
			hotel1.setAdrress(hotel.getAdrress());

			hotel1.setDiscription(hotel.getDiscription());
			hotel1.setEmail(hotel.getEmail());
			hotel1.setPhone1(hotel.getPhone1());
			hotel1.setPhone2(hotel.getPhone2());
			hotel1.setWebsite(hotel.getWebsite());
			hotel1.setWebsite(hotel.getWebsite());
			return hotelRepository.save(hotel1);
		} else 
		{
			return hotelRepository.save(hotel);
		}

	}

	@Override
	public void deleteHotel(Integer hid) {

		hotelRepository.deleteById(hid);
	

	}
	@Override
	public List<Hotel> showAllHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}
	@Override
	public Hotel showHotel(Integer hid) {
		// TODO Auto-generated method stub
		return hotelRepository.getById(hid);
	}

	
	
	
}