package MavenPackage;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;


public class Compose 
{
	WebDriver driver;	
	  
	public Compose(WebDriver d)
	{
		driver=d;
	}
  public void sendmail() throws Exception
  {
	  driver.findElement(By.xpath("//input[@class='composeicon']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("to")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.id("Subj")).sendKeys("hello");
	  driver.findElement(By.name("Content")).sendKeys("this is sample mail");
	  driver.findElement(By.id("send_top")).click();
	  Thread.sleep(3000);
  }
  public void signout()
  {
	  driver.findElement(By.linkText("Sign Out")).click();	  
	  driver.close();
  }
}
