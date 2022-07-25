package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.amazon.qa.base.AmznTestBase;
import com.amazon.qa.pages.AmznHomePage;

public class AmznHomePageTest extends AmznTestBase{
	
	AmznHomePage hp;

	public AmznHomePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		hp = new AmznHomePage();
	}
	
	@Test
	public void hoverOnSignInBtnTest() {
		hp.hoverOnSignIn();
	}
	
	@Test
	public void clickOnSignInTest() {
		hp.hoverOnSignIn();
		hp.clickOnSignIn();
	}
	
	@Test
	public void searchiPadTest() {
		hp.searchiPhone();
	}
	
	@Test
	public void iPadSuggestionListTest() throws InterruptedException {
		hp.searchiPhone();
		hp.iPhoneSuggestionList();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
