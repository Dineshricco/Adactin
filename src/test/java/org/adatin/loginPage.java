package org.adatin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class loginPage extends Base {
	   public loginPage() {
			PageFactory.initElements(driver, this);
		}
	   
  @FindBy(id="username")
  private WebElement txtUserName;
	


   @FindBy(id="password")
   private WebElement Txtpassword;
   
   @FindBy(id="login")
   private WebElement btnlogin;

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtpassword() {
	return Txtpassword;
}

public WebElement getBtnlogin() {
	return btnlogin;
}
public void login(String userName,String password) {
	sendKeys(txtUserName, userName);
	sendKeys(Txtpassword, password);
	clickElement(getBtnlogin());
}




   
}