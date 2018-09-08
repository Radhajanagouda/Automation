package com.k2js.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver=null;
	LoginPage lp;
	public HomePage(WebDriver hpdriver) {
		this.driver=hpdriver;
	}
		
	@FindBy(xpath="//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
	private WebElement signInElement;	
	
	public LoginPage clickSignon() {
		signInElement.click();
		
		return PageFactory.initElements(driver,LoginPage.class);
		
	}
	
	
	
	
}
