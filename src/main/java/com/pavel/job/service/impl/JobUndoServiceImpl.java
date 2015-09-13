package com.pavel.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavel.job.dao.JobUndoDao;
import com.pavel.job.entity.JobUndo;
import com.pavel.job.service.JobUndoService;
@Service
public class JobUndoServiceImpl implements JobUndoService{
	
	@Autowired
	private JobUndoDao jobUndoDao;
	
	@Override
	public JobUndo getJobUndo(int id) {
		// TODO Auto-generated method stub
		return jobUndoDao.getJobUndo(id);
	}

	@Override
	public List<JobUndo> getJobUndoList(JobUndo jobUndo) {
		// TODO Auto-generated method stub
		return jobUndoDao.getJobUndoList(jobUndo);
	}

	@Override
	public void saveJobUndo(JobUndo jobUndo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delJobUndo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateJobUndo(JobUndo jobUndo) {
		// TODO Auto-generated method stub
		return false;
	}

}
