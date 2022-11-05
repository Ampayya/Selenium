package com.JavaBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Identifyurladd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://bing.com");
		String actual_googlehomepageurladdress=driver.getCurrentUrl();
		System.out.println("the current actual url address after lounching google home page is:"+actual_googlehomepageurladdress);
        
		String expected_googlehomepageurladdress="google.com";
		System.out.println("the ecpected url address of googlehomepage is:"+expected_googlehomepageurladdress);
	    
		if(actual_googlehomepageurladdress.contains(expected_googlehomepageurladdress))
		{
			System.out.println("url method-pass");
		}
		else
		{
			System.out.println("url not matched-fail");
		}
		driver.close();
	}

}
