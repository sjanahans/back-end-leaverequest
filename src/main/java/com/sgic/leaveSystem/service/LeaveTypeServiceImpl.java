package com.sgic.leaveSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leaveSystem.entity.LeaveType;
import com.sgic.leaveSystem.repository.LeaveTypeRepository;

@Service
public class LeaveTypeServiceImpl implements LeaveTypeService {

	@Autowired
	private LeaveTypeRepository leaveTypeRepository;
	@Override
	public List<LeaveType> getleaveType() {
		return leaveTypeRepository.findAll();	
	}

	@Override
	public void createleaveType(LeaveType leaveType) {
		leaveTypeRepository.save(leaveType);
		
	}

	@Override
	public void updateleaveType(LeaveType leaveType, Integer id) {
		LeaveType exitLeaveType = leaveTypeRepository.getOne(id);
		if (exitLeaveType != null) {
			leaveType.setId(id);
			leaveTypeRepository.save(leaveType);
		}
		
	}

	@Override
	public void deleteleaveType(Integer id) {
		
		leaveTypeRepository.deleteById(id);
	}

}
