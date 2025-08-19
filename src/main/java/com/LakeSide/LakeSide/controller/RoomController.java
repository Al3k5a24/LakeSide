package com.LakeSide.LakeSide.controller;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.LakeSide.LakeSide.model.Room;
import com.LakeSide.LakeSide.response.roomResponse;
import com.LakeSide.LakeSide.service.IRoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	private IRoomService roomService;
    
	@PostMapping("/add/new-room")
	public ResponseEntity<roomResponse> addNewRoom(
			@RequestParam("photo") MultipartFile photo,
			@RequestParam("roomType") String roomType,
			@RequestParam("roomPrice") BigDecimal roomPrice) throws IOException{
		Room savedRoom=roomService.addNewRoom(photo,roomType,roomPrice);
		roomResponse response=new roomResponse(savedRoom.getId(),
				savedRoom.getRoomType(),savedRoom.getRoomPrice());
		return ResponseEntity.ok(response);
	}
}
