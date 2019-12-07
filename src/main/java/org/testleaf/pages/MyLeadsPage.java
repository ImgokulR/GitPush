package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	 public CreateLeadPage myLeadsPage() {
		 driver.findElementByLinkText("Create Lead").click();
		 return new CreateLeadPage();
	 }	
	}