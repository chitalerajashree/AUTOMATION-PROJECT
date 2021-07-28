package GlobalSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home 
{
	public void InvokeBrowser()
	{
		//Verifying title of globalsqa//
		
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
	  //((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	  
	  //For search button //
	  
	  
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
	  
	  
	  //for scroll down and select tools and trianing options//
	  
	/*  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

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
	  
	  //For checking footer of webpage//
	  
	 /* driver.findElement(By.className("header_soc_facebook")).click();
	  driver.findElement(By.className("header_soc_google")).click();
	  driver. findElement(By.className("header_soc_linkedin")).click();
	  driver. findElement(By.className("header_soc_twitter")).click();
	  driver. findElement(By.className("header_soc_pinterest")).click();*/
	 
	  //For scrolling down window and select options of trianings//
	  
	  ((JavascriptExecutor)driver).executeScript("scroll(0,1300)");
	  driver.findElement(By.className("jcarousel-next jcarousel-next-horizontal")).click();
      // driver.findElement(By.className("img_overlay_icon")).click();
       
	}


	

	public static void main(String[] args) 
	{
		 Home myobj =new Home();
		 myobj.InvokeBrowser();
	      
	}
}

