package com.mine.seltest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumBasicTest {

	private WebDriver driver;		
	
	@Before
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver",
	        "C:\\Users\\mayee\\sts_workspace\\seltest\\chromedriver.exe");
//	    "/home/vagrant/workspace/Testing/chromedriver");
		
	    driver = new ChromeDriver();  
	}	
	
	 
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();	
		System.out.println("value of title = " + title);
		assertEquals(title, "Demo Guru99 Page");
	}	
	
	@Test				
	public void googleMainPageTest() {	
		driver.get("http://google.com/");  
		System.out.println("inside googletest");
	}	
	
	@After
	public void afterTest() {
		driver.quit();			
	}	
}
