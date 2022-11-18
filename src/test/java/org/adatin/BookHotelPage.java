package org.adatin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends Base {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement txtFristName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCcNum ;
	
	@FindBy(id="cc_type")
	private WebElement txtCcType;
	
	@FindBy(id="cc_exp_month")
	private WebElement txtExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement txtCcExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFristName() {
		return txtFristName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCcNum() {
		return txtCcNum;
	}
	public WebElement getTxtCcType() {
		return txtCcType;
	}
	public WebElement getTxtExpMonth() {
		return txtExpMonth;
	}
	public WebElement getTxtCcExpYear() {
		return txtCcExpYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	public void booking(String txtFristName,String txtLastName,
			String txtAddress,String txtCcNum,
			String txtCcType,String txtExpMonth,String txtExpYear,
			String txtCvv  ) {

	
	sendKeys(getTxtFristName(), txtFristName);
	sendKeys(getTxtLastName(), txtLastName);
	sendKeys(getTxtAddress(), txtAddress);
	sendKeys(getTxtCcNum(), txtCcNum);
	sendKeys(getTxtCcType(), txtCcType);
	sendKeys(getTxtExpMonth(), txtExpMonth);
	sendKeys(getTxtCcExpYear(), txtExpYear);
	sendKeys(getTxtCvv(), txtCvv);
     clickElement(getBtnBookNow());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}