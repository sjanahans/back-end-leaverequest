package com.sgic.leaveSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leaveSystem.entity.LeaveRequest;
import com.sgic.leaveSystem.repository.LeaveRequestRepository;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService {
	@Autowired
	public LeaveRequestRepository leaveRequestRepository;

	@Override
	public List<LeaveRequest> getleaveRequest() {
		return leaveRequestRepository.findAll();
	}

	@Override
	public void createLeaveRequest(LeaveRequest leaveRequest) {
		leaveRequestRepository.save(leaveRequest);

	}

	@Override
	public void updateLeaveRequest(LeaveRequest leaveRequest, Integer id) {
		LeaveRequest exitLeaveRequest = leaveRequestRepository.getOne(id);
		if (exitLeaveRequest != null) {
			leaveRequest.setId(id);
			leaveRequestRepository.save(leaveRequest);
		}

	}

	@Override
	public void deleteLeaveRequest(Integer id) {
		leaveRequestRepository.deleteById(id);

	}

}
