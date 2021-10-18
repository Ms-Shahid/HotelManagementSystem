package com.cg.hbm.service;



import java.util.List;

import com.cg.hbm.entities.RoomDetails;

public interface IRoomDetailsService {
	public RoomDetails addRoomDetails(RoomDetails roomDetails);
	public RoomDetails updateRoomDetails(RoomDetails roomDetails, Integer room_id);
	public void removeRoomDetails(Integer room_id);
	public List<RoomDetails> showAllRoomDetails();
	public RoomDetails showRoomDetails(Integer room_id);
}
