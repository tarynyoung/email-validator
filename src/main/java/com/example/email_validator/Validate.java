package com.example.email_validator;

public class Validate {
	

	public static void Validate(String email){
		//counter for @ symbol
		int atChar = 0;
		//counter for . symbol
		int dotChar = 0;
		//counter for # of rules passed
		int rulesPassed = 0;
		
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
	}
}
