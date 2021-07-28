package GlobalSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_ScrollDown 
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
		  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

		  driver.findElement(By.id("Tools")).click();
		  try
		  {
			Thread.sleep(2000);
		} 
		  catch (InterruptedException e) 
		  {
			
			e.printStackTrace();
		}
		  driver.findElement(By.id("Trainings")).click();
		  

	}

}
