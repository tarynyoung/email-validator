package com.example.email_validator;

public class Validate {
	
	private static int rulesPassed, atChar, dotChar;

	public static String Validate(String email){
		//counter for @ symbol
		atChar = 0;
		//counter for . symbol
		dotChar = 0;
		//counter for # of rules passed
		rulesPassed = 0;
		
		char c;
		
		//check each character in the string, count the @ and .
		for(int i =0; i < email.length(); i++){
			c = email.charAt(i);
			if(c==64){
				atChar++;
			}
			if(c==46){
				dotChar++;
			}
		}
		
		//if there is exactly one @ then it passes the rule, so increment rulesPassed count
		if(atChar==1){
			rulesPassed++;
		}
		//if there is at least one . then it passes the rule, so increment the count
		if(dotChar>0){
			rulesPassed++;
		}
		
		System.out.println("This email passes "+rulesPassed+" rules.");
		
		//if it passes both rules then it is a valid email
		if(rulesPassed==2){
			return "This is a valid email";
		}
		else{
			return "This is not a valid email";
		}
	}
	
	//get methods for the counters
		//useful for tests
		public static int getAtChar(){
			return atChar;
		}
		
		public static int getDotChar(){
			return dotChar;
		}
		//returns # of rules passed
		//return value of 2 means everything passes
		public static int getRulesPassed(){
			return rulesPassed;
		}
		
		//prints # of rules passed as a string
		public String toString(){
			return "This email passes "+rulesPassed+" rules";
		}
}
