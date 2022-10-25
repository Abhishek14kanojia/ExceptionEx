package com.Exception;

public class MoodAnalyzer {
	private String message;


	public MoodAnalyzer(String message) {
		this.message = message;
	}
	public  MoodAnalyzer() {
	
	}
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	 public String analyseMood() {
	        try {
	            if (message.toLowerCase().contains("sad")) {
	                return "Sad";
	            } else if (message.toLowerCase().contains("happy")) {
	                return "Happy";
	            } else {
	                return "Any";
	            }
	        } catch (NullPointerException e) {
	            return "Invalid Mood";
	        }
	 }
}
