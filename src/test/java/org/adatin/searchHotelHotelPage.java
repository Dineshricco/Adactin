package org.adatin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class searchHotelHotelPage extends Base {
	public searchHotelHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement txtlocation;

	@FindBy(id="username_")
	private WebElement textwelcomemsg;
	
	@FindBy(id="hotels")
	private WebElement txthotels;
	
	@FindBy(id="room_type")
	private WebElement txtroomtype;
	
	@FindBy(id="room_nos")
	private WebElement txtroomno ;
	
	@FindBy(id="datepick_in")
	private WebElement txtdatepickin;
	
	@FindBy(id="datepick_out")
	private WebElement txtdatepickout;

	@FindBy(id="adult_room")
	private WebElement txtadultroom ;
	
	@FindBy(id="child_room")
	private WebElement txtchildroom ;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit ;

	public WebElement getTxtlocation() {
		return txtlocation;
	}

	public WebElement getTextwelcomemsg() {
		return textwelcomemsg;
	}

	public WebElement getTxthotels() {
		return txthotels;
	}

	public WebElement getTxtroomtype() {
		return txtroomtype;
	}

	public WebElement getTxtroomno() {
		return txtroomno;
	}

	public WebElement getTxtdatepickin() {
		return txtdatepickin;
	}

	public WebElement getTxtdatepickout() {
		return txtdatepickout;
	}

	public WebElement getTxtadultroom() {
		return txtadultroom;
	}

	public WebElement getTxtchildroom() {
		return txtchildroom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
    public void search1(String location,String hotels,String roomtype,String roomno,String datepickin,String datepickout,String adultroom,String childroom) {
    	
    sendKeys(getTxtlocation(), location);
    sendKeys(getTxthotels(), hotels);
    sendKeys(getTxtroomtype(), roomtype);
    sendKeys(getTxtroomno(), roomno);
    sendKeys(getTxtdatepickin(), datepickin);
    sendKeys(getTxtdatepickout(), datepickout);
    sendKeys(getTxtadultroom(), adultroom);
    sendKeys(getTxtchildroom(), childroom);
    clickElement(getBtnSubmit());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
}
}

