package com.Lavender002_Java;

import java.util.Arrays;

public class FindLongestWord {

	public static void main(String[] args) {
		String test = "Time to code";
				
		System.out.println(result(test));
}



public static String result (String arg) {
	
	String [] element = arg.split(" ");
	String answer = "";
	int max = 0 ; 
	for (int i = 0; i < element.length; i++) {
		
				if ( element[i].length() > max) {
					max = element[i].length() ;
				}	
		}
 
  
for (int i = 0; i < element.length; i++) {
	if (element[i].length() == max) {
		answer =(element[i].toString());
	}
}
	
	return answer;
	
	
	
}
}