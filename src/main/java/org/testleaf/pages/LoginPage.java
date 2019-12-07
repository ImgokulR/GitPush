package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	
	public LoginPage enterUserName(String data) {
		driver.findElementById("username").sendKeys(data);
		return this;
		
	}
	
	
	public LoginPage enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
//		HomePage hp = new HomePage();
//		return hp;
		return new HomePage();
	}
	
	

}
