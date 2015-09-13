package com.pavel.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavel.job.dao.JobMonitorDao;
import com.pavel.job.entity.JobMonitor;
import com.pavel.job.service.JobMonitorService;

@Service
public class JobMonitorServiceImpl implements JobMonitorService{
	@Autowired
	private JobMonitorDao jobMonitorDao;
	@Override
	public List<JobMonitor> getJobMonitorList(JobMonitor jobMonitor) {
		// TODO Auto-generated method stub
		return jobMonitorDao.getJobMonitorList(jobMonitor);
	}

}
