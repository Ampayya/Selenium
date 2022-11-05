package com.JavaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testloginfb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String expected_Title="FaceBook";
		
		String actual_Title=driver.getTitle();
		
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("FaceBook login page-pass");
		}
		else
		{
			System.out.println("failed to FaceBook login page-fail");
		}
		driver.findElement(By.id("email")).sendKeys("Amapaiah AP");
		
		driver.findElement(By.id("pass")).sendKeys("9652422442");
		
		driver.findElement(By.name("login")).click();
		
		//WebElement LoginButton=driver.findElement(By.name("Login"));
		//LoginButton.click();
		driver.close();
		}

	}


