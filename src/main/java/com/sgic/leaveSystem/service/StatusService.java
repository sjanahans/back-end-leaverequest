package com.sgic.leaveSystem.service;

import java.util.List;

import com.sgic.leaveSystem.entity.Status;

public interface StatusService {
	public List<Status> getStatus();

	public void createStatus(Status status);

	public void updateStatus(Status status, Integer id);

	public void deleteStatus(Integer id);
}
