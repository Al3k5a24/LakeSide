package com.LakeSide.LakeSide.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BookedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @Column
    private LocalDate checkInDate;

    @Column
    private LocalDate checkOutDate;

    @Column
    private String guestFullName;

    @Column
    private String guestEmail;
    
    @Column
    private int NumOfAdults;
    
    @Column
    private int NumOfChildren;
    
    @Column
    private int totalGuests;
    
    @Column
    private String bookingConfCode;
    
    //relationship between tables
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="room_id")
    private Room room;

    public BookedRoom(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate, String guestFullName,
            String guestEmail, int numOfAdults, int numOfChildren, int totalGuests, String bookingConfCode, Room room) {
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

    //function that will calculate total number of guest and store value in field totalGuests
    public void calculateTotalGuest(){
        this.totalGuests=NumOfAdults+NumOfChildren;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setGuestFullName(String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public void setNumOfAdults(int numOfAdults) {
        NumOfAdults = numOfAdults;
        //in case on some unpredicted change 
        calculateTotalGuest();
    }

    public void setNumOfChildren(int numOfChildren) {
        NumOfChildren = numOfChildren;
        //in case on some unpredicted change 
        calculateTotalGuest();
    }

    public void setTotalGuests(int totalGuests) {
        this.totalGuests = totalGuests;
    }

    public void setBookingConfCode(String bookingConfCode) {
        this.bookingConfCode = bookingConfCode;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public String getGuestFullName() {
        return guestFullName;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public int getNumOfAdults() {
        return NumOfAdults;
    }

    public int getNumOfChildren() {
        return NumOfChildren;
    }

    public int getTotalGuests() {
        return totalGuests;
    }

    public String getBookingConfCode() {
        return bookingConfCode;
    }

    public Room getRoom() {
        return room;
    }
}