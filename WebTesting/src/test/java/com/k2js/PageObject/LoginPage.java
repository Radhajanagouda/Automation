package com.k2js.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver=null;
	
	public LoginPage(WebDriver thisPageDr) {
		this.driver=thisPageDr;				
	}
	@FindBy(xpath="//input[@type='email'][@class='whsOnd zHQkBf']")
	private WebElement username;
	
	@FindBy(xpath="//span[@class='RveJvd snByac'][text()='Next']")
	private WebElement nextBtn;
	
	
	public void PassUsername() {
		username.sendKeys("radha.janagouda@gmail.com");
	}
	
	public PwdPage clickNext() {
		nextBtn.click();
		return PageFactory.initElements(driver,PwdPage.class);
	}
	
	
}
