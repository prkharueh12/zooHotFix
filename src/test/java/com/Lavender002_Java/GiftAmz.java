package com.Lavender002_Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GiftAmz {

	public static void main(String[] args) {
		
		String test = "012444444" ;
		
		uniqueChar(test);
		
	}
	
	public static void uniqueChar (String arg) {
		try {
			String testOne [] = arg.split("");
			System.out.println(arg);
			Set<String> hash_Set = new HashSet<String>(Arrays.asList(testOne));
		  
        
        System.out.println(hash_Set);
		} catch (Exception e) {
			System.out.println("Invalid Value");
		}
		

		
		
		
	}

}
