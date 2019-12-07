package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	 public MyLeadsPage myHomePage() {
		 driver.findElementByLinkText("Leads").click();
		 return new MyLeadsPage();
	 }
	
	}