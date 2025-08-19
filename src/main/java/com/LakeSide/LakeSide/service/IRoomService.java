package com.LakeSide.LakeSide.service;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.web.multipart.MultipartFile;

import com.LakeSide.LakeSide.model.Room;

public interface IRoomService {

	Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException;
    
}
