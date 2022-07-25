package com.amazon.qa.pages;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.AmznTestBase;

public class AmznHomePage extends AmznTestBase{
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	public WebElement signIn;
	
	@FindBy(id="nav-link-accountList")
	public WebElement signInClk;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement search;
	
	@FindBy(xpath="//div[starts-with(@aria-label,'iphone') and (@role='button')]")
	public List<WebElement> suggList;
	
	public AmznHomePage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public void hoverOnSignIn() {
		Actions act = new Actions(driver);
		act.moveToElement(signIn).build().perform();	
	}
	
	public void clickOnSignIn() {
		signInClk.click();
	}
	
	public void searchiPhone() {
		search.sendKeys("iPhone");
	}
	
	public void iPhoneSuggestionList() throws InterruptedException {
		System.out.println(suggList.size());
		Thread.sleep(2000);
		for(WebElement k : suggList) {
			System.out.println(k.getText());
		}
	}

}
