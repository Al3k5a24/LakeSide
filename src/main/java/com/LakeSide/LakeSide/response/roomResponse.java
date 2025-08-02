package com.LakeSide.LakeSide.response;

import java.math.BigDecimal;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import lombok.Data;

//Response DTOs
//we can choose what data should be sent and seen by guest
@Data //Getters and Setters
public class roomResponse {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked=false;
    private String photo;

    private List<bookedRoomResponse> bookings;

    public roomResponse(Long id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public roomResponse(Long id, String roomType, BigDecimal roomPrice, boolean isBooked, byte[] photoByte,
            List<bookedRoomResponse> bookings) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        //converting image from string to base64 for easier load, display and transport
        this.photo = photoByte != null ? Base64.encodeBase64String(photoByte) : null;
        this.bookings = bookings;
    }   
}
