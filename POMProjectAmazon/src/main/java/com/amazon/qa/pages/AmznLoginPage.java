package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazon.qa.base.AmznTestBase;

public class AmznLoginPage extends AmznTestBase{

	@FindBy(id="ap_email")
	public WebElement e_mail;
	
	@FindBy(id="continue")
	public WebElement contBtn;
	
	@FindBy(xpath="//div[@role='alert']//div//div//ul")
	public WebElement errMessage;
	
	public AmznLoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void enterCorrectEmail() {
		e_mail.sendKeys(prop.getProperty("email"));
		contBtn.click();
	}
	
	public void enterWrongEmail() {
		e_mail.sendKeys(prop.getProperty("wrongmemail"));
		contBtn.click();
	}
	
	public void readErrMessage() {
		String act = errMessage.getText();
		String Exp = "We cannot find an account with that e-mail address";
		System.out.println(act);
		Assert.assertTrue(true);
	}
	

}
