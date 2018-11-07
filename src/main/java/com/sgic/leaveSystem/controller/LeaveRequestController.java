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

import com.sgic.leaveSystem.entity.LeaveRequest;
import com.sgic.leaveSystem.service.LeaveRequestService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3200)
@RestController
public class LeaveRequestController {
	@Autowired
	private LeaveRequestService leaveRequestService;

	@GetMapping("/leaverq")
	public List<LeaveRequest> getleaveRequest() {
		return leaveRequestService.getleaveRequest();
	}
	@PostMapping("/leaverq")
	public void cleaveRequest(@RequestBody LeaveRequest leaveRequest) {
		leaveRequestService.createLeaveRequest(leaveRequest);
	}
	@PutMapping("/leaverq/{id}")
	public void uleaveRequest(@RequestBody LeaveRequest leaveRequest,@PathVariable Integer id) {
		leaveRequestService.updateLeaveRequest(leaveRequest, id);
		
	}
	@DeleteMapping("/leaverq/{id}")
	public void dleaveRequest(LeaveRequest leaveRequest,@PathVariable Integer id) {
		leaveRequestService.deleteLeaveRequest(id);
	}

}
