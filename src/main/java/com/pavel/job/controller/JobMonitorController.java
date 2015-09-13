package com.pavel.job.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pavel.job.entity.JobMonitor;
import com.pavel.job.service.JobMonitorService;
@Controller
public class JobMonitorController {
	@Autowired
	private JobMonitorService iJobMonitorService;
	@RequestMapping("/getJobMonitorList")
	private String getAllJobUndo(HttpServletRequest request,HttpServletResponse response,JobMonitor jobMonitor) {
		
		String jobName = jobMonitor.getJob_name();
		if (null!=jobName) {
			try {
				jobName = new String (jobName.getBytes("ISO-8859-1"),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jobMonitor.setJob_name(jobName);
		/*String jobNameOrIsSuccess = request.getParameter("jobNameOrIsSuccess");
		
		if (null!=jobNameOrIsSuccess) {
			if (jobNameOrIsSuccess.indexOf("Y")>-1||jobNameOrIsSuccess.indexOf("N")>-1) {
				jobMonitor = new JobMonitor();
				jobMonitor.setIs_success(jobNameOrIsSuccess);
			}else {
				jobMonitor = new JobMonitor();
				jobMonitor.setJob_name(jobNameOrIsSuccess);
			}
		}*/
		List<JobMonitor> jml = iJobMonitorService.getJobMonitorList(jobMonitor);
		request.setAttribute("jml", jml);
		return "/jsp/job_monitor.jsp";
	}
}
