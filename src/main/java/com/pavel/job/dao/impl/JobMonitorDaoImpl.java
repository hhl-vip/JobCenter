package com.pavel.job.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pavel.job.dao.JobMonitorDao;
import com.pavel.job.entity.JobMonitor;
@Repository
public class JobMonitorDaoImpl implements JobMonitorDao{
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<JobMonitor> getJobMonitorList(JobMonitor jobMonitor) {
		String hql = null;
		List<JobMonitor> list = null;
		if (null!=jobMonitor) {
			if (null!=jobMonitor.getJob_name()&&!"".equals(jobMonitor.getJob_name())) {
				hql = "from JobMonitor where job_name like :job_name";
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				query.setString("job_name", "%"+jobMonitor.getJob_name()+"%");
				list = query.list();
			}else {
				/*hql = "from JobMonitor where is_success = :is_success";
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				query.setString("is_success", jobMonitor.getIs_success());
				list = query.list();*/
				hql = "from JobMonitor";
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				list = query.list();
			}
		}else {
			hql = "from JobMonitor";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			list = query.list();
		}
		return list;
	}

}
