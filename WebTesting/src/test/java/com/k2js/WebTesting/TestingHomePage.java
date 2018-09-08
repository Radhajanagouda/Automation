package com.k2js.WebTesting;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.k2js.PageObject.GmailEmails;
import com.k2js.PageObject.HomePage;
import com.k2js.PageObject.LoginPage;
import com.k2js.PageObject.PwdPage;
public class TestingHomePage {
	WebDriver driver=null;
	HomePage hp=null;	
	LoginPage lp;
	PwdPage pp;
	GmailEmails GE;
	
	@Test
	public void VerifyLoginPage() throws InterruptedException {
		lp=hp.clickSignon();
		
		lp.PassUsername();
		pp = lp.clickNext();
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		TimeUnit.SECONDS.sleep(5);
		//GE=
		pp.passPwwd();
		
		try {
			GE= pp.clickNext();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("Inbox", GE.getInboxDetails());		
	}
	
	@BeforeSuite
	public void initialSetting() {
		//System.setProperty("webdriver.gecko.driver", ".\\EndFolders\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTrainingByJitendra\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver= new FirefoxDriver();		
	}
	
	@BeforeTest
	public void OpenUrl() {	
		
		try {
			driver.get("https://www.google.com/gmail/about/#");	
			this.hp= PageFactory.initElements(driver, HomePage.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void endBrowser() {
		driver.close();
	}
	
	
	

}
