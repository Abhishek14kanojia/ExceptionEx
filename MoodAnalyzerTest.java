package com.Exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	
	@Test
	public void resultissad() {
		moodAnalyzer.setMessage("I Am Sad");
		String actualMood = moodAnalyzer.analyseMood();
		Assertions.assertEquals("Sad", actualMood);
	
	}
	@Test
	public void resultishappy() {
		moodAnalyzer.setMessage("I Am Happy");
		String actualMood = moodAnalyzer.analyseMood();
		Assertions.assertEquals("happy", actualMood);
	
	}
	@Test
	public void resultisany() {
		moodAnalyzer.setMessage("I Am Any mood");
		String actualMood = moodAnalyzer.analyseMood();
		Assertions.assertEquals("Any", actualMood);
	
	}
	@Test
	public void Null() {
		moodAnalyzer.setMessage("Null");
		String actualMood = moodAnalyzer.analyseMood();
		Assertions.assertEquals("Null", actualMood);
	
	}
}
