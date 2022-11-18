package org.adatin;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Booking extends Base {


	
	
	@BeforeClass
public static void beforeClass() {
		getDriver();
		
		enterUrl("https://adactinhotelapp.com/");
		
         windowMax();
		
	}
	
	@Test
	public void signIn() throws IOException, InterruptedException {
		loginPage login=new loginPage();
		login.login(getDataFromExcel("Data", 1, 0),getDataFromExcel("Data", 1,1));
	login.getBtnlogin();
	
	//select hotel
	searchHotelHotelPage hotel1=new searchHotelHotelPage();

	hotel1.search1(getDataFromExcel("Data", 1, 2), getDataFromExcel("Data", 1, 3),
			getDataFromExcel("Data", 1, 4),getDataFromExcel("Data", 1, 5),
			getDataFromExcel("Data", 1, 6), getDataFromExcel("Data", 1, 7),
			getDataFromExcel("Data", 1, 8), getDataFromExcel("Data", 1, 9));
     hotel1.getBtnSubmit();
     Thread.sleep(1000);
     
     //select hotel
     SelectHotelPage page= new SelectHotelPage();
     page.SelectHotel();
     
     //book hotel
     BookHotelPage bookhotel=new BookHotelPage();
     bookhotel.booking(getDataFromExcel("Data", 1, 10), getDataFromExcel("Data", 1, 11), 
    		 getDataFromExcel("Data", 1, 12),getDataFromExcel("Data", 1, 13),
    		 getDataFromExcel("Data", 1, 14), getDataFromExcel("Data", 1, 15),
    		 getDataFromExcel("Data", 1, 16), getDataFromExcel("Data", 1, 17));
     bookhotel.getBtnBookNow();
     
  //   @
    // //booking confirm
     BookingConform orderid=new BookingConform();
     
     Thread.sleep(7000);
     WebElement txtorderid = orderid.getOrderno();
     String attribute = getAttribute(txtorderid);
System.out.println(attribute);
orderid.writeCellData("Data", 1, 19, attribute);
	orderid.bookcnfrm();
	
	//cancel
	
	
	CancelBookingPage c =new CancelBookingPage();
	String excel = getDataFromExcel("Data", 1, 19);

	
	
	
	
	
	
	}
}











