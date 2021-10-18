package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	

}

/*

@Query(value ="select *from u from User where u.name =?1 and u.password =?2")
public List<User> getAllUserBynameAndPassword(Integer Id, String password);


*/
/*  where x.lastname = ?1 and x.firstname = ?2
*/

/*public List<User> findByUsernameAndPassword(Integer id);
*/