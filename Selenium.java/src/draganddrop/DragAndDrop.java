package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./Driverfiles.chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://Jqueryui.com");
        */ 
		
		WebDriver driver;
		String Appilictionurladdress="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver","./DriverFiles1/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(Appilictionurladdress);
		
		driver.manage().window().maximize();
		WebElement frameofDragAndDropElements=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frameofDragAndDropElements);
		WebElement DragMeToMyTargetElement=driver.findElement(By.id("draggable"));
		System.out.println(" DragMeToMyTargetElement is identified");
		
		WebElement DropHereElement=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(DragMeToMyTargetElement,DropHereElement).perform();
	}

}
