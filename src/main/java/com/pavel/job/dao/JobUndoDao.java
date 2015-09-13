package com.pavel.job.dao;

import java.util.List;

import com.pavel.job.entity.JobUndo;

public interface JobUndoDao {
	
	public JobUndo getJobUndo(int id);
	
	public List<JobUndo> getJobUndoList(JobUndo jobUndo);
	
	public void saveJobUndo(JobUndo jobUndo);
	
	public boolean delJobUndo(int id);
	
	public boolean updateJobUndo(JobUndo jobUndo);
}
