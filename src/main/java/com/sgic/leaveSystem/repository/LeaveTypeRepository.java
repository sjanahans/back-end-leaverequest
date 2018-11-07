package com.sgic.leaveSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leaveSystem.entity.LeaveType;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Integer> {

}
