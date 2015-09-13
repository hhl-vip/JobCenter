package com.pavel.job.service;

import java.util.List;

import com.pavel.job.entity.JobMonitor;

public interface JobMonitorService {
	public List<JobMonitor> getJobMonitorList(JobMonitor jobMonitor);
}
