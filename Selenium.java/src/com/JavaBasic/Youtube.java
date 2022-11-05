package com.JavaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	
	private static List<WebElement> HeaderBlockLinks = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.tsrtconline.in");
		
		driver.manage().window().maximize();
		
		WebElement HeaderBlock=driver.findElement(By.id("menu-wrap"));
		List<WebElement>HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
		
		int HeaderBlockLinks_size=HeaderBlockLinks.size();
		System.out.println("the number of webElements in the HeaderBlock are:"+HeaderBlockLinks_size);
		
		for(int i=0; i<HeaderBlockLinks_size; i++)
		{
			String HeaderLinkName=HeaderBlockLinks.get(i).getText();
			System.out.println(i+""+HeaderLinkName);
			HeaderBlockLinks.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			driver.navigate().back();
			HeaderBlock=driver.findElement(By.className("menu-wrap"));
			HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
			
			
		  		}
		
		

	}

}
