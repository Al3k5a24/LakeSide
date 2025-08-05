package com.LakeSide.LakeSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LakeSide.LakeSide.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
    
}
