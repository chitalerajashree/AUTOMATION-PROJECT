package GlobalSqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Angular_Scrollable 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/");
		 WebElement TesterHub = driver.findElement(By.xpath("//*[@id=\"menu-item-2822\"]/a"));    //mouse over on testerhub
		 Actions builder = new Actions(driver);
	        builder.moveToElement(TesterHub).build().perform();

		WebElement Angularjs = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[2]/a/span"));    //mouse over on Angularjs
		 Actions builder1 = new Actions(driver);
	        builder.moveToElement(Angularjs).build().perform();
	        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[2]/div/ul/li[2]/a/span")).click();
	        

	}

}
