package com.pavel.job.entity;

public class JobMonitor {
	private int id;
	private String job_name;
	private String job_start_time;
	private String job_end_time;
	private String job_run_time;
	private String is_success;
	private String exception;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public String getJob_start_time() {
		return job_start_time;
	}
	public void setJob_start_time(String job_start_time) {
		this.job_start_time = job_start_time;
	}
	public String getJob_end_time() {
		return job_end_time;
	}
	public void setJob_end_time(String job_end_time) {
		this.job_end_time = job_end_time;
	}
	public String getJob_run_time() {
		return job_run_time;
	}
	public void setJob_run_time(String job_run_time) {
		this.job_run_time = job_run_time;
	}
	public String getIs_success() {
		return is_success;
	}
	public void setIs_success(String is_success) {
		this.is_success = is_success;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	
}	
