package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.AmznTestBase;
import com.amazon.qa.pages.AmznHomePage;
import com.amazon.qa.pages.AmznLoginPage;

public class AmznLoginPageTest extends AmznTestBase{
	
	AmznLoginPage lp;
	AmznHomePage hp;
	
	public AmznLoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		hp = new AmznHomePage();
		lp = new AmznLoginPage();
		hp.clickOnSignIn();
	}
	
	@Test
	public void enterEmailTest() {
		lp.enterCorrectEmail();
	}
	
	@Test
	public void enterWrongEmailTest() {
		lp.enterWrongEmail();
	}
	
	@Test
	public void readErrorMessageTest() {
		lp.enterWrongEmail();
		lp.readErrMessage();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
