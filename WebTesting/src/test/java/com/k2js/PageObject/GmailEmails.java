package com.k2js.PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class GmailEmails {
	WebDriver driver;
	
	
	public GmailEmails(WebDriver wd) {
		this.driver=wd;	
	}
	
	public String getInboxDetails() {
		FluentWait<WebDriver> fw= new FluentWait<WebDriver>(driver);
		fw.pollingEvery(Duration.ofSeconds(2));
		fw.withTimeout(Duration.ofSeconds(30));
		
		WebElement inboxEle= fw.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Inbox"))));
		return inboxEle.getText();
	}
	
	
	

}
