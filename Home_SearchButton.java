package GlobalSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_SearchButton 
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
		  driver.findElement(By.id("s")).sendKeys("CHEATSHEETS");
		  
		  driver.findElement(By.className("button_search")).click();
		  try 
		 {
			Thread.sleep(2000);
		   
		  }
		  catch (InterruptedException e) 
		 {
			
			e.printStackTrace();
		}


	}

}
