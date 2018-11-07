package com.sgic.leaveSystem.service;

import java.util.List;

import com.sgic.leaveSystem.entity.LeaveType;

public interface LeaveTypeService {
	public List<LeaveType> getleaveType();

	public void createleaveType(LeaveType leaveType);

	public void updateleaveType(LeaveType leaveType, Integer id);

	public void deleteleaveType(Integer id);

}
