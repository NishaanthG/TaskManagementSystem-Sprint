package com.example.demo.Exception;

public class GetFailsException extends RuntimeException{
	 
	private String code;

	public GetFailsException(String code , String Message){
		super(Message);
		this.code = code;
	}
	
	public String getCode() {
        return code;
    }

}
