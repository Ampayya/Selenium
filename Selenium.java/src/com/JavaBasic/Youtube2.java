 package com.JavaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		
		driver.findElement(By.id("divUsername")).sendKeys("Ampayya_kumar");
		driver.findElement(By.id("divPassword")).sendKeys("AP_9652@.com");
		driver.findElement(By.id("btnLogin")).click();
	
		
		}
		
		
		
	}


