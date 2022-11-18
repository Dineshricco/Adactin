package org.task;
//child class
public class JavaTest1 extends JavaTest {
	
	@Override
	public void testA() {
		System.out.println("hi");
		 
	}
	public void testC() {
		System.out.println(2022);

	}
	public static void main(String[] args) {
		JavaTest1 j=new JavaTest1();
	j.testA();
      
	}
	
	

}
