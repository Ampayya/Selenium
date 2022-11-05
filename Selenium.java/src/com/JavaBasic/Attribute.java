package com.JavaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.chrome.com");
		
		//System.out.println("The value of class Atribute is - gb_1 gb_2 gb_8d gb_8c");
		
		//WebElement SignInElement=driver.findElement(By.linkText("sign in"));
		//String SignInElementAttributeValue=SignInElement.getAttribute("class");
		 
		// System.out.println("SignInElementAttributeValue");
		 
		 driver.close();
		

	}

}
