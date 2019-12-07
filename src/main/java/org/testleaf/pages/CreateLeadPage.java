package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	 
		 public CreateLeadPage clickCreateLead(){
		 driver.findElementByLinkText("Create Lead").click();
		 return this;
		 }
		 public CreateLeadPage enterCompanyName(String data) {
		 driver.findElementById("createLeadForm_companyName").sendKeys(data);
		 return this;
		 }
		 public CreateLeadPage enterFirstName(String data) {
		 driver.findElementById("createLeadForm_firstName").sendKeys(data);
		 return this;
		 }
		 public CreateLeadPage enterLastName(String data) {
		 driver.findElementById("createLeadForm_lastName").sendKeys(data);
		 return this;
		 }
		 public Viewleadpage submitCreatelead() {
		 driver.findElementByClassName("smallSubmit").click();
		 return new Viewleadpage();
	 }
}
	