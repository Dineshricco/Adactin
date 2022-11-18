package org.adatin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConform extends Base{
	
	public BookingConform() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderno;
	

	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private WebElement bookitinerary;


	public WebElement getOrderno() {
		return orderno;
	}


	public WebElement getBookitinerary() {
		return bookitinerary;
	}

	public void bookcnfrm() {
	clickElement(getBookitinerary());
	}
	
}
	
	
//
//	@FindBy(id="order_no")
//private WebElement txtorderid;
	
	
//	@FindBy(id="my_itinerary")
//	private WebElement myitenery;
//
//
//	public WebElement getTxtorderid() {
//		return txtorderid;
//	}
//
//
//	public WebElement getMyitenery() {
//		return myitenery;
//	}
//	public void itenery(String webelement) {
//		sendKeys(getTxtorderid(), getTitle());
//clickElement(getMyitenery());
//
//	}
//}	
//
//	

	
	
	
	
