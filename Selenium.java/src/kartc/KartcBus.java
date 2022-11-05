package kartc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KartcBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.ksrtc.in");
			driver.manage().window().maximize();
			
			WebElement headerBlock=driver.findElement(By.className("container"));
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
			
			
			headerBlock=driver.findElement(By.className("container"));
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
			} 

	}

}
