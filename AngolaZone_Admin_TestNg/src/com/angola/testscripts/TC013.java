package com.angola.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC013 {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://angolazone-admin.herokuapp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
@Test (priority=13,groups="Users")
	
	public void ClickOnActiveUser() throws Exception{
	driver.findElement(By.id("email")).sendKeys("bhupinder.singh@ideausher.com");
    driver.findElement(By.name("password")).sendKeys("123456");
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();//Login
	 Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();//Click on Categories
   Thread.sleep(4000);
   
   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[3]")).click();//Click On User
   
   Thread.sleep(4000);
   
   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/a[1]")).click();
   System.out.println("Clicked on Active User option");
   Thread.sleep(4000);
     
  }
@AfterMethod
public void ClickOnLogout() throws Exception{
	   driver.quit();
	   Thread.sleep(3000);



}

}