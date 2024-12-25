package com.example.demo.Exception;

public class DeleteFailsException extends RuntimeException{
	
	private String code;
	
	public DeleteFailsException(String code , String message) {
		super(message);
		this.code=code;
	}
	
	public String getCode() {
        return code;
    }

}
