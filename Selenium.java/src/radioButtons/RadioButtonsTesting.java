package radioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://echoecho.com/htmlfoms10.htm");
		driver.manage().window().maximize();
		
		WebElement radioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td"+"div/span/form/table[3]/tbody/tr/td"));
		List<WebElement>group1RadioButtons=radioButtonsBlock.findElements(By.name("group1"));
		int group1RadioButtonsLength=group1RadioButtons.size();
		System.out.println("Number of radio Buttons in Group1 are:"+group1RadioButtonsLength);
		
		for(int i=0; i<group1RadioButtonsLength; i++)
		{
			group1RadioButtons.get(i).click();
			//Thread.sleep(5000);
		
		for(int j=0; j<group1RadioButtonsLength; j++)
		{
			System.out.println(group1RadioButtons.get(j).getAttribute("value")+""+group1RadioButtons.get(j).getAttribute("checked"));
		}
		System.out.println();
		//driver.quit();
		}}}	
		

	
	


