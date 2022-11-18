package org.task;

import java.io.IOException;

import org.openqa.selenium.WebElement;

	public class Base  {
			public static void main(String[] args) throws IOException, InterruptedException {
			Base employee= new Base();
		employee.booking();
		}
	
		public void booking() throws IOException, InterruptedException {
		Base1	 methods=new Base1 ();
		Base1.getdriver();
		
		Base1.EnterAppUrl("https://adactinhotelapp.com/index.php");
		
		Base1.MaximizeWindow();
		
		WebElement txtusername = methods.findelementbyid("username");
		
		String name = methods.readDataFromCell("Data", 1, 0);
		methods.sendKeysAndEnter(txtusername, name);
		
		WebElement txtpasword = methods.findelementbyid("password");
		String pass = methods.readDataFromCell("Data", 1,1);
		methods.sendKeysAndEnter(txtpasword, pass);
		
		WebElement btnlogin = methods.findelementbyid("login");
	    methods.elementclick(btnlogin);
	    
		WebElement txtlocation = methods.findelementbyid("location");
		String location = methods.readDataFromCell("Data", 1, 2);
		methods.sendKeysAndEnter(txtlocation, location);

		WebElement txthotels = methods.findelementbyid("hotels");
		String hotels = methods.readDataFromCell("Data", 1, 3);
		methods.sendKeysAndEnter(txthotels, hotels);
		
		WebElement txtroomtype = methods.findelementbyid("room_type");
		String roomtype = methods.readDataFromCell("Data", 1, 4);
		methods.sendKeysAndEnter(txtroomtype, roomtype);
		
		WebElement txtroomno = methods.findelementbyid("room_nos");
		String roomno = methods.readDataFromCell("Data", 1, 5);
		methods.sendKeysAndEnter(txtroomno, roomno);
		
		WebElement txtdatepickin = methods.findelementbyid("datepick_in");
		String datepickin = methods.readDataFromCell("Data", 1, 6);
		methods.sendKeysAndEnter(txtdatepickin, datepickin);
		
		WebElement txtdatepickout = methods.findelementbyid("datepick_out");
		String datepickout = methods.readDataFromCell("Data", 1, 7);
		methods.sendKeysAndEnter(txtdatepickout, datepickout);
		
		WebElement txtadultroom = methods.findelementbyid("adult_room");
		String adultroom = methods.readDataFromCell("Data", 1, 8);
		methods.sendKeysAndEnter(txtadultroom, adultroom);
		
		WebElement txtchildroom = methods.findelementbyid("child_room");
		String childroom = methods.readDataFromCell("Data", 1, 9);
		methods.sendKeysAndEnter(txtchildroom, childroom);
		
		WebElement btnsubmit = methods.findelementbyid("Submit");
	    methods.elementclick(btnsubmit);
	    
	    WebElement btnradio = methods.findelementbyid("radiobutton_0");
	    methods.elementclick(btnradio);
	    
	    WebElement btncontinue = methods.findelementbyid("continue");
	    methods.elementclick(btncontinue);
		
	    WebElement txtfirstname = methods.findelementbyid("first_name");
		String firstname = methods.readDataFromCell("Data", 1, 10);
		methods.sendKeysAndEnter(txtfirstname, firstname);
		
		WebElement txtlastname = methods.findelementbyid("last_name");
		String lastname = methods.readDataFromCell("Data", 1, 11);
		methods.sendKeysAndEnter(txtlastname, lastname);
		
		WebElement txtaddress = methods.findelementbyid("address");
		String address = methods.readDataFromCell("Data", 1, 12);
		methods.sendKeysAndEnter(txtaddress, address);
		
		WebElement txtccnum = methods.findelementbyid("cc_num");
		String ccnum = methods.readDataFromCell("Data", 1, 13);
		methods.sendKeysAndEnter(txtccnum, ccnum);
		
		WebElement txtcctype = methods.findelementbyid("cc_type");
		String cctype = methods.readDataFromCell("Data", 1, 14);
		methods.sendKeysAndEnter(txtcctype, cctype);
		
		WebElement txtexpmonth = methods.findelementbyid("cc_exp_month");
		String expmonth = methods.readDataFromCell("Data", 1, 15);
		methods.sendKeysAndEnter(txtexpmonth, expmonth);
		
		WebElement txtccexpyear = methods.findelementbyid("cc_exp_year");
		String ccexpyear = methods.readDataFromCell("Data", 1, 16);
		methods.sendKeysAndEnter(txtccexpyear, ccexpyear);
		
		WebElement txtcvv = methods.findelementbyid("cc_cvv");
		String cvv = methods.readDataFromCell("Data", 1, 17);
		methods.sendKeysAndEnter(txtcvv, cvv);
		
		WebElement btnbooknow = methods.findelementbyid("book_now");
		methods.elementclick(btnbooknow);
		
		Thread.sleep(10000);
		
		WebElement txtorderno = methods.findelementbyid("order_no");
		String orderno = methods.elementgetattribute(txtorderno);
		System.out.println(orderno);	
		methods.writeCellData("Data", 1, 18, orderno);
	    Base1.quitwindow();
		}
}