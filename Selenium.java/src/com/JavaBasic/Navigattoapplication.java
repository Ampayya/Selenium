package com.JavaBasic;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigattoapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();	
	    System.out.println("chrome Browser will be launched");
	    
	   driver.get("http://WWW.facebook.com");
	   System.out.println("navigate to facebook application");
	    
	    driver.navigate().to("http://bing.com");
	    System.out.println("navigates to bing application");
	    
	    driver.close();
	    System.out.println("close the browser");
	}

}
