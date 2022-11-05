package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerttsRtc {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.tsrtconline.in/oprs-web/");
		WebElement checkAvailibilityButton=driver.findElement(By.id("searchBtn"));
		checkAvailibilityButton.click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(10000);
		alert.accept();
		
	}

}
