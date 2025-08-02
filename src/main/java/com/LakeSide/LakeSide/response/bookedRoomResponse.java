package com.LakeSide.LakeSide.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class bookedRoomResponse {

    private Long bookingId;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String guestFullName;

    private String guestEmail;
    
    private int NumOfAdults;
    
    private int NumOfChildren;
    
    private int totalGuests;
    
    private String bookingConfCode;

    private roomResponse room;

    public bookedRoomResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfCode) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfCode = bookingConfCode;
    }

    public bookedRoomResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate, String guestFullName,
            String guestEmail, int numOfAdults, int numOfChildren, int totalGuests, String bookingConfCode,
            roomResponse room) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guestFullName = guestFullName;
        this.guestEmail = guestEmail;
        NumOfAdults = numOfAdults;
        NumOfChildren = numOfChildren;
        this.totalGuests = totalGuests;
        this.bookingConfCode = bookingConfCode;
        this.room = room;
    }

    
}
