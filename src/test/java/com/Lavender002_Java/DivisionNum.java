package com.Lavender002_Java;

public class DivisionNum {

	public static void main(String[] args) {

		System.out.println(division (1,100,3));
	
		String text = "My name is Park I like playing. My favorite team is ManU" ;
		dupWord (text);

}

	public static void dupWord (String arg) {
		String bText [] = arg.split(" ");
		for (int i = 0; i < bText.length; i++) {
			for (int j = i+1; j < bText.length; j++) {
				if (bText[i].equals(bText[j])) {
					System.out.print(bText[j]+ " ");
				}
			}
		}
	}
	
	public static  int division (int num1, int num2 , int num3) {
		
		int count = 0 ;
		for (int i = num1; i <= num2; i++) {
			if(i % num3 == 0) {
				count +=1 ;
			}
		}
		
		return count;
			}
}