package com.Exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class MoodAnalyzerTest  {
	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	
	@Test
	public void resultissad()throws MoodAnalyzerException {
		moodAnalyzer.setMessage("I Am Sad");
		String actualMood = moodAnalyzer.analyseMood();
		Assertions.assertEquals("Sad", actualMood);
	
	}
	@Test
	public void resultishappy()throws MoodAnalyzerException {
		moodAnalyzer.setMessage("I Am Happy");
		String actualMood = moodAnalyzer.analyseMood();
		Assertions.assertEquals("happy", actualMood);
	
	}
	@Test
	public void resultisany()throws MoodAnalyzerException {
		moodAnalyzer.setMessage("I Am Any mood");
		String actualMood = moodAnalyzer.analyseMood();
		Assertions.assertEquals("Any", actualMood);
	
	}
	@Test
	public void Null() throws MoodAnalyzerException{
		 try {
	            moodAnalyzer.setMessage(null);
	            String actualmood = moodAnalyzer.analyseMood();
	            Assertions.assertEquals("Invalid Mood", actualmood);
	        } catch (MoodAnalyzerException e) {
	            System.out.println("Invalid Mood");
	        }
	}
}
