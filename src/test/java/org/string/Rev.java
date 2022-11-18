package org.string;

public class Rev {
	public static void main(String[] args) {
		String s ="welcome to greens";
		String op="";
		String[] sp = s.split("");
		
		
		for (String sl : sp) {
			String rev="";
			for (int i = sl.length()-1; i >=0; i--) {
				
				rev=rev+sl.charAt(i);
				
				
			}
		}
		System.out.println();
	}

}
