package com.pavel.job.dao;

import java.util.List;

import com.pavel.job.entity.JobMonitor;

public interface JobMonitorDao{
	public List<JobMonitor> getJobMonitorList(JobMonitor jobMonitor);
}
