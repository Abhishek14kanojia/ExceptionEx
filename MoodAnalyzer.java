package com.Exception;

public class MoodAnalyzer {

	public String moodAnalyzer(String message) {
		if(message.toLowerCase().contains("happy")) {
			return"Happy";
			
		}else if(message.toLowerCase().contains("sad")) {
			return "Sad";
		}else {
			return null;
		}
		
		
	}
	public static void main(String[] args) {
		MoodAnalyzer moods = new MoodAnalyzer();
		String mood = moods.moodAnalyzer("I Am Happy");
		System.out.println(mood);
		mood = moods.moodAnalyzer("I Am Sad");
		System.out.println(mood);
	}

}
