package com.pavel.job.controller;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pavel.job.entity.JobUndo;
import com.pavel.job.service.JobUndoService;


@Controller
public class JobUndoController {
	@Autowired
	private JobUndoService iJobUndoService;
	
//	@RequestMapping("/getJobUndo")
//	private void getJobUndo(int id,HttpServletRequest request){
//		
//		JobUndo jobUndo = iJobUndoService.getJobUndo(id);
//		request.setAttribute("jobUndo", jobUndo);
//	}
	@RequestMapping("/getJobUndoList")
	private String getAllJobUndoList(HttpServletRequest request,HttpServletResponse response) {
		
		
		List<JobUndo> jul = iJobUndoService.getJobUndoList(new JobUndo());
		request.setAttribute("jul", jul);
		return "/jsp/job_undo.jsp";
	}
	
}
