package org.string;

public class Interview {
	public static void main(String[] args) {
		String s="Welcome To Chennai@123";
		String rev ="";
		int upper=0,lower=0,special=0,number=0;
		for (int i =s.length()-1;i>=0; i++) {
			
			char c = s.charAt(i);
			System.out.println(c);
			if (Character.isUpperCase(c)) {
				upper++;
			}else if (Character.isLowerCase(c)) {
				lower++;
			
				
			
			}else if (Character.isDigit(c)) {
				number++;
			}else
				special++;
	
		}
		System.out.println("upper string is"+upper);
		System.out.println("lower string is"+lower);
		System.out.println("digit string is"+number);
		System.out.println("special string is"+special);
		}
		
		
		
		
		
	}


