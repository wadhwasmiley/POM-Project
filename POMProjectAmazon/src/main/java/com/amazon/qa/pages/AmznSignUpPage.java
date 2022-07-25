package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.AmznTestBase;

public class AmznSignUpPage extends AmznTestBase {
	
	@FindBy(linkText="Start here.")
	public WebElement start;
	
	@FindBy(id="ap_customer_name")
	public WebElement name;
	
	@FindBy(id="ap_email")
	public WebElement mobNmbr;
	
	@FindBy(id="ap_password")
	public WebElement pswrd;
	
	@FindBy(id="ap_password_check")
	public WebElement pswrdChk;
	
	@FindBy(id="continue")
	public WebElement cont;

	public AmznSignUpPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnStart() {
		start.click();
	}
	
	public void enterName() {
		name.sendKeys((prop.getProperty("firstname"))+" "+ (prop.getProperty("lastname")));
	}
	
	public void enterMobileNumber() {
		mobNmbr.sendKeys(prop.getProperty("mobile"));
	}
	
	public void enterPassword() {
		pswrd.sendKeys("password");
	}
	
	public void enterPasswordAgain() {
		pswrdChk.sendKeys("password");
	}
	
	public void clickOnContinue() {
		cont.click();
	}

}
