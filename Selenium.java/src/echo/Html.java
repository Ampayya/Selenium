package echo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Html {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\91812\\Desktop\\Ampaiah kumar\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
         driver.get("https://echoecho.com/htmlfoms10.htm");
			driver.manage().window().maximize();

	}

}
