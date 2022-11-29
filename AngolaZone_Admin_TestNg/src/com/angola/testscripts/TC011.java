package com.angola.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC011 {

	WebDriver driver;
		
		 @BeforeMethod
					public void setup() throws Exception{
						
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("https://angolazone-admin.herokuapp.com/login");
			driver.manage().window().maximize();
			Thread.sleep(4000);
						
			}
	@Test (priority=11,groups="Categories")
	
	public void ClickonUpdate() throws Exception{
	driver.findElement(By.id("email")).sendKeys("bhupinder.singh@ideausher.com");
    driver.findElement(By.name("password")).sendKeys("123456");
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();//Login
	 Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();//Click on Categories
   Thread.sleep(4000);
   
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP); 
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
   
   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/table/tbody/tr[1]/td[6]/div/button[1]/img")).click();
   Thread.sleep(3000);
   System.out.println("Click on Edit Category");
   
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
   driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
   Thread.sleep(5000);
   
	driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);

	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[3]/button[1]")).click();
	Thread.sleep(3000);
	System.out.println("Click on Update Button");
	
	}
   
   @AfterMethod
   public void ClickOnLogout() throws Exception{
	   driver.quit();
	   Thread.sleep(3000);
   }
   
   
   
   

}
