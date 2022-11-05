package com.JavaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apsrtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.apsrtc.ap.gov.in");
		
		WebElement headerBlock=driver.findElement(By.className("rtcNavigation"));
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		int headerBlockLinks_size=headerBlockLinks.size();
		System.out.println("The number of webElements in the HeaderBlock are :"+headerBlockLinks_size);
		for(int i=0; i<headerBlockLinks_size; i++)
		{
			String headerLinkName=headerBlockLinks.get(i).getText();
		    System.out.println(i+""+headerLinkName);
		    headerBlockLinks.get(i).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		
		
		headerBlock=driver.findElement(By.className("rtcNavigation"));
		headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		} 
		//driver.quit();
	
		
		
	}
}
				

	


