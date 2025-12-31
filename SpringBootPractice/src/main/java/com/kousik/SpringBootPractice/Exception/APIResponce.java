package com.kousik.SpringBootPractice.Exception;

public class APIResponce {

	private String message;
	private boolean success;
	
	
	public APIResponce() {
		super();
		// TODO Auto-generated constructor stub
	}


	public APIResponce(boolean success, String message) {
		super();
		this.setSuccess(success);
		this.message = message;
	}
	

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	

}
