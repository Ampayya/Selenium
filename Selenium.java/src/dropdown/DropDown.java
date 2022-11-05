package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.osmania.ac.in/");
			driver.manage().window().maximize();

		  WebElement selectlanguagesDropDown=driver.findElement(By.id("gtranslate_selector"));
		  List<WebElement>DropDownLanguages=selectlanguagesDropDown.findElements(By.tagName("option"));
		   int DropDownListLength=DropDownLanguages.size();
          System.out.println("The number of languages in the DropDown are:"+DropDownListLength);
           for(int i=0; i<DropDownListLength; i++)
           {
        	   String DropDownLanguage=DropDownLanguages.get(i).getText();
        	   System.out.println(i+""+DropDownLanguage);
           
           Select selection=new Select(selectlanguagesDropDown);
           //selection.selectByIndex(i);
          selection.selectByVisibleText(DropDownLanguages.get(i).getText());
           //selection.selectByValue();
           //driver.quit();
	}

	}}
