package com.JavaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headerblock {

	public static <webElement> void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.apsrtc.ap.gov.in");
		driver.manage().window().maximize();
		WebElement headerBlock=driver.findElement(By.className("rtcNavigation"));
		
		List<WebElement>headerLinks=headerBlock.findElements(By.tagName("a"));
        int headerBlockLinks_size=headerLinks.size();
		System.out.println("the number of webElement in the headerBlock are:"+headerBlockLinks_size);
		
		for(int i=0; i<headerBlockLinks_size;i++)
		{
			String headerLinkname=headerLinks.get(i).getText();
			System.out.println(i+""+headerLinkname);
			
			headerLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			headerBlock=driver.findElement(By.className("rtcNavigation"));
			headerLinks=headerBlock.findElements(By.tagName("a"));
			
			
			
		}
		
		
		
		
		
		
	}
}

