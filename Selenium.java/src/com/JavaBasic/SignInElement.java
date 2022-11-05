package com.JavaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInElement {

	private static final WebElement SigninElement = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
			
			//<a class="gb_1 gb_2 gb_8d gb_8c"
		    //href="https://accounts.google.com/>Sign in</a>SignIN-inspected element properties"
		WebElement SignInElement=driver.findElement(By.linkText("signin"));
		SigninElement.click();
			

	}

	
	}


