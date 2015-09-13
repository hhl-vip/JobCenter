package com.pavel.job.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pavel.job.dao.JobUndoDao;
import com.pavel.job.entity.JobUndo;
@Repository
public class JobUndoDaoImpl implements JobUndoDao{
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public JobUndo getJobUndo(int id) {
		// TODO Auto-generated method stub
		String hql = "from job_undo ju where ju.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setLong(0, id);
		
		return (JobUndo)query.uniqueResult();
	}

	@Override
	public List<JobUndo> getJobUndoList(JobUndo jobUndo) {
		String hql = "from JobUndo";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
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
