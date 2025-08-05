package com.LakeSide.LakeSide.service;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.LakeSide.LakeSide.model.Room;
import com.LakeSide.LakeSide.repository.RoomRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements IRoomService{
	
	private RoomRepository roomRepository;

	@Override
	public Room addNewRoom(MultipartFile file,
			String roomType,
			BigDecimal roomPrice) throws IOException {
		Room room=new Room();
		if(!file.isEmpty()) {
			byte[] photoByte=file.getBytes();
			room.setPhoto(photoByte);
		}
		room.setRoomPrice(roomPrice);
		room.setRoomType(roomType);
		
		return roomRepository.save(room);
		
	}
    
}
