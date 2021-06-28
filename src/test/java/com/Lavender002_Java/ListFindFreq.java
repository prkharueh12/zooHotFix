package com.Lavender002_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ListFindFreq {

	public static void main(String[] args) {
		
		Integer [] oriNum = {1,2,3,4,5,6,6,6};
		List <Integer> num = new ArrayList <Integer> (Arrays.asList(oriNum)) ;
		
		for (int i = 0; i < num.size(); i++) {
			
			//System.out.println(Collections.frequency(num, num.get(i)));	
				
				}
		
		
		String test = "park@gmail.com"; 
		String email [] = test.split("@");
		
		
		int len = email[0].length()	;
		
		//System.out.println(len);
		String emailP = "";
		
				if (len >=1 ) {
					 emailP = email[0].concat("****@");
				}
				
				if (len >=2 ) {
					 emailP = email[0].substring(0,2).concat("****@");
				}
				if (len >=3 ) {
					 emailP = email[0].substring(0,3).concat("****@");
				}
		if (len == 0 ) {
			System.out.println("Invalid");
		}else
			System.out.println(emailP + email[1]);
			
			
		}
	}
	

