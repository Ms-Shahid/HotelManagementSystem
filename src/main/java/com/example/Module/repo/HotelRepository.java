package com.example.Module.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Module.Entity.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {
	
	
}
