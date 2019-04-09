package com.mine.seltest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	/*
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();	
		System.out.println("value of title = " + title);
		assertEquals(title, "Demo Guru99 Page");  
	}	*/
	
	/* @Test				
	public void infoTest() {
		String baseUrl = "http://192.168.99.100:31732"; 
		driver.get(baseUrl);  
		
		driver.findElement(By.linkText("List Technology")).click(); 
		System.out.println("clicked images");
		sleep(4); 
		driver.close();
	}	*/ 
	
	/* 
	@Test				
	public void googleMainPageTest() {	
		driver.get("http://google.com/");  
		System.out.println("inside googletest");
		//driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		WebElement e = driver.findElement(By.name("q")); 
		e.sendKeys("selenium"); 
		sleep(4); 
		e.submit(); 
		// driver.manage().window().maximize();
		sleep(4); 
		
		
		e.findElement(By.linkText("Images")).click(); 
		sleep(4); 
		System.out.println("clicked images");
		sleep(4); 
		driver.close();
	}	 
	*/ 
	public void amazonSearchTest() { 
		System.out.println("inside amazon test");
		driver.get("http://amazon.com"); 
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox")); 
		ele.sendKeys("iphone");
		ele.click();
	}
	
	void sleep(int sec) { 
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	@After
	public void afterTest() {
		driver.quit();			
	}	
}
