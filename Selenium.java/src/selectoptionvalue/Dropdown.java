package selectoptionvalue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.RouteSelector.Selection;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://my.monsterindia.com/sponsered_popup.html");
			driver.manage().window().maximize();
			
		WebElement currentLocationBlock=driver.findElement(By.className("border_grey1"));
		List<WebElement>currentLocation_cityNames=currentLocationBlock.findElements(By.tagName("option"));
		int currentLoctioncities_Length=currentLocation_cityNames.size();
		System.out.println(currentLocation_cityNames);
		
		for(int i=0; i<currentLoctioncities_Length; i++)
		{
			String cityName=currentLocation_cityNames.get(i).getText();
			System.out.println(i+""+cityName);
		}
		Select selection=new Select(currentLocationBlock);
		selection.selectByVisibleText("Bengaluru/Bangalure");
		//selection.selectByIndex(1);
		//selection.selectByValue("500");
        
		WebElement industry=driver.findElement(By.name("industry"));
		Select select=new Select(industry);
		//select.selectByIndex(1);
		
		select.selectByValue("4");
		//select.selectByVisibleText("banking/Accounting/Financial services");
		
		//select.deselectByValue("65");
		
		//select.deselectAll();
		
		//driver.quit();
		
		
		
		
	}	
		
		

	

}
