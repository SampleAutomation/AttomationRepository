package MavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MultipleBrowsers 

{

WebDriver driver;
@Test
@Parameters({"browser"})
	public void open(String br)
		{
			if(br.matches("IE"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe");
				WebDriver driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.get("http://www.google.com");
				
				driver.close();
				//Search();
				
			}
			if(br.matches("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Java\\jdk1.7.0_11\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get("http://www.google.com");
			    driver.close();
				//Search();
			}
		//driver.get("http://www.google.com");
		//Search();
		}
  
/*	public void Search()
	{
		driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		driver.findElement(By.id("_fZl")).click();
		
	}
*/

}
