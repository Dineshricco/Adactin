package org.adatin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends Base {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
     
	@FindBy(id="radiobutton_0")
	private WebElement btnradio;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public void SelectHotel() {

clickElement(getBtnradio());
clickElement(getBtncontinue());
	
	
	}
   
	
}
