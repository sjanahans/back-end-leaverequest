package com.sgic.leaveSystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.leaveSystem.entity.Status;
import com.sgic.leaveSystem.repository.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService {
	@Autowired
	public StatusRepository statusRepository;

	@Override
	public List<Status> getStatus() {
		return statusRepository.findAll();
	}

	@Override
	public void createStatus(Status Status) {
		statusRepository.save(Status);
	}

	@Override
	public void updateStatus(Status Status, Integer id) {
		Status exitStatus = statusRepository.getOne(id);
		if (exitStatus != null) {
			Status.setId(id);
			statusRepository.save(Status);
		}

	}

	@Override
	public void deleteStatus(Integer id) {
		statusRepository.deleteById(id);

	}

}
