package com.JavaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdiver.chrome.driver", "/Selenium.java/DriverFiles/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		*/
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://bing.com");
		
        Thread.sleep(10000);				
				
		String bingHomePageTitle=driver.getTitle();
		
		System.out.println("The title of the bing home page is:"+bingHomePageTitle);
		
		driver.close();

	}

}
