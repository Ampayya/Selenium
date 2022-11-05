package com.JavaBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.geco.drover","C:\\Users\\91812\\Desktop\\Ampaiyya\\Selenium.java\\DriverFiles\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        
        System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
         ChromeDriver drive = new ChromeDriver();
	}

}
