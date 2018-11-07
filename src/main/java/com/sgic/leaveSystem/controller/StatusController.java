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

import com.sgic.leaveSystem.entity.Status;
import com.sgic.leaveSystem.service.StatusService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3200)
@RestController
public class StatusController {

	@Autowired
	private StatusService statusService;

	@GetMapping("/status")
	public List<Status> getStatus() {
		return statusService.getStatus();
	}
	
	@PostMapping("/status")
	public void createStatus(@RequestBody Status status) {
		statusService.createStatus(status);
	}
	@PutMapping("/status/{id}")
	public void updateStatus(@RequestBody Status status,@PathVariable Integer id) {
		statusService.updateStatus(status, id);	
	}
	@DeleteMapping("/status/{id}")
	public void deleteStatus(Status status,@PathVariable Integer id) {
		statusService.deleteStatus(id);		
	}
}
