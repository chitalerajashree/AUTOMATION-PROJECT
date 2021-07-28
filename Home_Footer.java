package GlobalSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Footer 
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
		  driver.findElement(By.className("header_soc_facebook")).click();
		  driver.findElement(By.className("header_soc_google")).click();
		  driver. findElement(By.className("header_soc_linkedin")).click();
		  driver. findElement(By.className("header_soc_twitter")).click();
		  driver. findElement(By.className("header_soc_pinterest")).click();
		 

	}

}
