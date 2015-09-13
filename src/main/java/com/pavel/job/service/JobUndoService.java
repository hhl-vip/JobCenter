package com.pavel.job.service;

import java.util.List;

import com.pavel.job.entity.JobUndo;

public interface JobUndoService {
	
	public JobUndo getJobUndo(int id);
	
	public List<JobUndo> getJobUndoList(JobUndo jobUndo);
	
	public void saveJobUndo(JobUndo jobUndo);
	
	public boolean delJobUndo(int id);
	
	public boolean updateJobUndo(JobUndo jobUndo);
}
