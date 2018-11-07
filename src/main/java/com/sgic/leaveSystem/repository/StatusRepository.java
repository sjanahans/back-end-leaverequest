package com.sgic.leaveSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leaveSystem.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Integer>{

}
