package GlobalSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_VerifyTitle 
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  driver.get("https://www.globalsqa.com/");
		  String expectedTitle ="CheatSheets, Mindmaps, Free Ebooks- GlobalSQA";
		  String actualTitle ="";
		  actualTitle = driver.getTitle();
		  if(actualTitle.contentEquals(expectedTitle))
		  {
			  System.out.println("Test Passed");
		  }
		  else
		  {
			  System.out.println("Test Failed");
		  }

	}

}
