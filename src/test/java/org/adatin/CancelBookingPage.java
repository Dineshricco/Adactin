package org.adatin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends Base {
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_id_text")
	private  WebElement txtorderId;
	
	@FindBy(id="search_hotel_id")
	
	private WebElement btngo;
	
	 
	@FindBy(xpath="//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3]")
	private WebElement cancelbooking;


	public WebElement getTxtorderId() {
		return txtorderId;
	}


	public WebElement getBtngo() {
		return btngo;
	}


	public WebElement getCancelbooking() {
		return cancelbooking;
	}

	public void canclbooking(String orderid) {
		clickElement(getBtngo());
	}
	
	}	







