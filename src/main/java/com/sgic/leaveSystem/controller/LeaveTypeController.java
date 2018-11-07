package com.sgic.leaveSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.leaveSystem.entity.LeaveType;
import com.sgic.leaveSystem.service.LeaveTypeService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3200)
@RestController
public class LeaveTypeController {
	
	@Autowired
	private LeaveTypeService leaveTypeService;
	
	@GetMapping("/leavety")
	public List<LeaveType> getleaveType() {
		return leaveTypeService.getleaveType();
	}
	@PostMapping("/leaverty")
	public void cleaveType(@RequestBody LeaveType leaveType) {
		leaveTypeService.createleaveType(leaveType);
	}
	@PutMapping("/leavety/{id}")
	public void uleaveType(@RequestBody LeaveType leaveType,@PathVariable Integer id) {
		leaveTypeService.updateleaveType(leaveType, id);
	}
	@DeleteMapping("/leavety/{id}")
	public void dleaveType(LeaveType leaveType,@PathVariable Integer id) {
		leaveTypeService.deleteleaveType(id);
		
	}
	

}
