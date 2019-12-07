package org.testleaf.testCases;

import org.testleaf.base.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_CreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	@Test(dataProvider = "fetchData")
	public void tcCreateLead(String Uname, String pwd, String Cname, String Fname, String Lname ) {
		
		new LoginPage()
		.enterUserName(Uname)
		.enterPassword(pwd)
		.clickLogin()		
		.clickCRMSFA()
		.myHomePage().
		myLeadsPage().clickCreateLead().enterCompanyName(Cname).enterFirstName(Fname).enterLastName(Lname).submitCreatelead();
	}
}