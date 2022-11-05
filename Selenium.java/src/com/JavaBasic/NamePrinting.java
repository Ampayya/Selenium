package com.JavaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NamePrinting {
public static void main(String[] args) {
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
      String expected_Title="orangehrm";
      String actual_Title=driver.getTitle();
      
      if(actual_Title.equals(expected_Title))
       System.out.println("orangehrm matched-pass");
      else
       System.out.println("orangehrm not matched-fail");
      
      
      driver.findElement(By.id("txtUsername")).sendKeys("Ampaiah_AP");
      driver.findElement(By.id("txtPassword")).sendKeys("AP_9652@.com");
      driver.findElement(By.name("Submit")).click();

}   
}
