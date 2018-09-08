package com.k2js.PageObject;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PwdPage {
	WebDriver driver=null;
	//WebDriverWait wait;
	
	public PwdPage(WebDriver pwdPageDr) {
		this.driver=pwdPageDr;		
	}
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	
	public void passPwwd() throws InterruptedException {
		
		WebElement pwdele= driver.findElement(By.name("password"));
		pwdele.sendKeys("jANAGOUDA1986");
		
	}
	
	public GmailEmails clickNext() {
		
		/*WebElement element = driver.findElement(By.cssSelector("div[id='passwordNext']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		*/
		
		//driver.switchTo().defaultContent();
		Actions aele = new Actions(driver);
		
		aele.moveToElement(driver.findElement(By.cssSelector("div[id='passwordNext']")));
		//aele.moveToElement(driver.findElement(By.xpath("//span[@class='RveJvd snByac'][text()='Next']")));
		aele.click();
		
		//aele.build();
		aele.perform();
		
		
		return PageFactory.initElements(driver, GmailEmails.class);
	}
	
	
	
	
	
}
