package com.JavaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndaiElement {

	private static final String IndaiaElementText = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement IndiaElement=driver.findElement(By.className("uU7dJb"));
		String IndiaElementText=IndiaElement.getText();
		System.out.println("The text of India element on google Homepage is:"+IndaiaElementText);
		
		driver.close();

	}

}
