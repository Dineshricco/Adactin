package org.task;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit extends Base1 {
	
	@BeforeClass
	
      public static void openBrowser() {
		WebDriverManager.chromiumdriver().setup();
		getdriver();
        EnterAppUrl("https://adactinhotelapp.com/");
		MaximizeWindow();

	}
	@Test
	public void enterDetails() throws IOException, InterruptedException {
    WebElement txtusername = findelementbyid("username");
    String name = readDataFromCell("Data", 1, 0);
	sendKeysAndEnter(txtusername, name);
	
	WebElement txtpasword =findelementbyid("password");
	String pass = readDataFromCell("Data", 1,1);
	sendKeysAndEnter(txtpasword, pass);
	
	WebElement btnlogin = findelementbyid("login");
	
    elementclick(btnlogin);
    
    WebElement loginsuccess = findelementbyid("username_show");
    
   String actloginsuccess = elementgetattribute(loginsuccess);
    Assert.assertEquals("verify after login", "Hello DINESHKUMARS123!",actloginsuccess);
   
   
   
   
   
   
   WebElement txtlocation = findelementbyid("location");
	String location = readDataFromCell("Data", 1, 2);
	sendKeysAndEnter(txtlocation, location);
	WebElement txthotels = findelementbyid("hotels");
	String hotels = readDataFromCell("Data", 1, 3);
	sendKeysAndEnter(txthotels, hotels);
	WebElement txtroomtype = findelementbyid("room_type");
	String roomtype = readDataFromCell("Data", 1, 4);
	sendKeysAndEnter(txtroomtype, roomtype);
	
	WebElement txtroomno = findelementbyid("room_nos");
	String roomno = readDataFromCell("Data", 1, 5);
	sendKeysAndEnter(txtroomno, roomno);
	
	WebElement txtdatepickin = findelementbyid("datepick_in");
	String datepickin = readDataFromCell("Data", 1, 6);
	sendKeysAndEnter(txtdatepickin, datepickin);
	
	WebElement txtdatepickout = findelementbyid("datepick_out");
	String datepickout = readDataFromCell("Data", 1, 7);
	sendKeysAndEnter(txtdatepickout, datepickout);
	
	WebElement txtadultroom = findelementbyid("adult_room");
	String adultroom = readDataFromCell("Data", 1, 8);
	sendKeysAndEnter(txtadultroom, adultroom);
	
	WebElement txtchildroom = findelementbyid("child_room");
	String childroom = readDataFromCell("Data", 1, 9);
	sendKeysAndEnter(txtchildroom, childroom);
	
	WebElement btnsubmit = findelementbyid("Submit");
    elementclick(btnsubmit);
   
   
   
   WebElement aftersubmit = findelementbyclassName("login_title");
  String selhotel = elementgettext(aftersubmit);
   assertEquals("verify after submit", "Select Hotel",selhotel);
   
   
    WebElement btnradio = findelementbyid("radiobutton_0");
   elementclick(btnradio);
    
    
    
   
    WebElement btncontinue = findelementbyid("continue");
   elementclick(btncontinue);
   
   
   WebElement submitsuccess = findelementbyxpath("//td[text()='Book A Hotel ']");
   String submit1 = elementgettext(submitsuccess);
   assertEquals("verify the select hotel","Book A Hotel",submit1);
 
   
	
    WebElement txtfirstname = findelementbyid("first_name");
	String firstname = readDataFromCell("Data", 1, 10);
	sendKeysAndEnter(txtfirstname, firstname);
	
	WebElement txtlastname = findelementbyid("last_name");
	String lastname = readDataFromCell("Data", 1, 11);
	sendKeysAndEnter(txtlastname, lastname);
	
	WebElement txtaddress = findelementbyid("address");
	String address = readDataFromCell("Data", 1, 12);
	sendKeysAndEnter(txtaddress, address);
	
	WebElement txtccnum = findelementbyid("cc_num");
	String ccnum = readDataFromCell("Data", 1, 13);
	sendKeysAndEnter(txtccnum, ccnum);
	
	WebElement txtcctype = findelementbyid("cc_type");
	String cctype = readDataFromCell("Data", 1, 14);
	sendKeysAndEnter(txtcctype, cctype);
	
	WebElement txtexpmonth = findelementbyid("cc_exp_month");
	String expmonth = readDataFromCell("Data", 1, 15);
	sendKeysAndEnter(txtexpmonth, expmonth);
	
	WebElement txtccexpyear = findelementbyid("cc_exp_year");
	String ccexpyear = readDataFromCell("Data", 1, 16);
	sendKeysAndEnter(txtccexpyear, ccexpyear);
	
	WebElement txtcvv = findelementbyid("cc_cvv");
	String cvv = readDataFromCell("Data", 1, 17);
	sendKeysAndEnter(txtcvv, cvv);
		   
	
	WebElement btnclick = findelementbyid("book_now");
	elementclick(btnclick);
	
	Thread.sleep(10000);
	
	WebElement txtorderno = findelementbyid("order_no");
	String orderno = elementgetattribute(txtorderno);
	System.out.println(orderno);	
	writeCellData("Data", 1, 18, orderno);
	
WebElement cnfrmbooking = findelementbyxpath("//td[text()='Booking Confirmation ']");
	String cnfrmmsg = elementgettext(cnfrmbooking);
	assertEquals("verify after booking","Booking Confirmation",cnfrmmsg);
	
	
	
	}
	
	
//	@AfterClass
//	public static  void windowclose() {
		

	
//    quitwindow();
//	}
	
	}
	
	

