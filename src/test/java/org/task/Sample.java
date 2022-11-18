package org.task;

public class Sample {
	public static void main(String[] args) {
		
	
	String s="hello";
			String rev="";
			for (int i =s.length()-1;i>=0; i--) {
				
				char c = s.charAt(i);
				System.out.println(c);
				rev=rev+c;
				
				
			}
			System.out.println(rev);
			
			
			
			
	}

}
