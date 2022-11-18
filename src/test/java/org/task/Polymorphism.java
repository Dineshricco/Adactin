package org.task;


//polymorphism overloading
public class Polymorphism {
	//public class Studentinfo
	//private void studentld(int num) (
	//private void studentld (String name) {
	//private void studentld (String email, int ph) ‹
//	private void studentId(int dob, String add) (
	//public static void main(String[] arg) ( StudentInfo info
//arguments datatypes
	public void employeeInfo() {
		
System.out.println("Employee Info");
	}
	public void employeeInfo(int id) {
	System.out.println("Employee ID is "+id);

	}
	
	public void employeeInfo(String Name) {
		System.out.println("Employee name is"+Name);
	}
	//arugents are datatype count
	public void employeeInfo(String Email,long Num) {
		System.out.println("Employee email is"+Email+"Employee numbr is"+Num);
	}
	//arguments are data type order
	public void employeeInfo(long Num,String Email) {
	System.out.println("Employee alter email"+Email+"Employee alter numbr is"+Num);
	

	}
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.employeeInfo("Details");
		p.employeeInfo("1234");
		p.employeeInfo("vijay");
		p.employeeInfo(7358361421l," dark@123");
		p.employeeInfo("dark@234", 723456664);
	}

		}

	













