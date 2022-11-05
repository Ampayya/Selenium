package com.JavaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	private static final WebElement YourOrdersElement = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement helloSignInElement=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act=new Actions (driver);
		act.moveToElement(helloSignInElement).perform();
		
		WebElement YourOrderElement=driver.findElement(By.linkText("Year Orders"));
		
		YourOrdersElement.click();

	}

}
