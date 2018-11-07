package com.sgic.leaveSystem.service;

import java.util.List;

import com.sgic.leaveSystem.entity.LeaveRequest;

public interface LeaveRequestService {
	public List<LeaveRequest> getleaveRequest();

	public void createLeaveRequest(LeaveRequest leaveRequest);

	public void updateLeaveRequest(LeaveRequest leaveRequest, Integer id);

	public void deleteLeaveRequest(Integer id);

}
