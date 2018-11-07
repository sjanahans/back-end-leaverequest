package com.sgic.leaveSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leaveSystem.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {

}
