package com.JavaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {

	public static <webApp> void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");

	    String expected_Title="OrangeHRM";
	    String actual_Title=driver.getTitle();
	    if(actual_Title.contains(expected_Title))
	    {
	    	System.out.println("OrangeHRM login page-pass");
	    }
	    else
	    {
	    	System.out.println("failed to navigate to OrangeHRM login page-fail");
	    }
	    driver.findElement(By.id("txtUsername")).sendKeys("Ampaiah_AP");
	    driver.findElement(By.id("txtPassword")).sendKeys("AP_9652@.com");
	    driver.findElement(By.id("btnLogin")).click();
		

	}

}
//System.out.println("failed to navigate to OrangeHRM login page-fail");