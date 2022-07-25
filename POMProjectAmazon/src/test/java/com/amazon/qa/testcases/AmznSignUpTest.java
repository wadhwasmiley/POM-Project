package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.AmznTestBase;
import com.amazon.qa.pages.AmznHomePage;
import com.amazon.qa.pages.AmznSignUpPage;

public class AmznSignUpTest extends AmznTestBase{
	
	AmznHomePage hp;
	AmznSignUpPage sp;

	public AmznSignUpTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		hp = new AmznHomePage();
		sp = new AmznSignUpPage();
		hp.hoverOnSignIn();
		Thread.sleep(2000);
		sp.clickOnStart();
	}
	
	@Test
	public void enterNameTest() {
		sp.enterName();
	}
	
	@Test
	public void enterMobileNumberTest() {
		sp.enterMobileNumber();
	}
	
	@Test
	public void enterPasswordTest() {
		sp.enterPassword();
	}
	
	@Test
	public void enterPasswordAgainTest() {
		sp.enterPasswordAgain();
	}
	
	@Test
	public void clickOnContinueTest() {
		sp.clickOnContinue();
	}
	
//	@Test
	public void enterAllCredentials() {
		sp.enterName();
		sp.enterMobileNumber();
		sp.enterPassword();
		sp.enterPasswordAgain();
		sp.clickOnContinue();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
