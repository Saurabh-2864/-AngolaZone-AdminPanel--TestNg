package com.angola.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC005 {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://angolazone-admin.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
	}
	@Test (priority=5,groups="Categories")
	public void ClickonCategories() throws Exception{
		 driver.findElement(By.id("email")).sendKeys("bhupinder.singh@ideausher.com");

	        driver.findElement(By.name("password")).sendKeys("123456");
	        Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();
              Thread.sleep(6000);
              
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();
	    System.out.println("Click on categories option");
	    Thread.sleep(8000);
	}
	
	
	
	
	
@AfterMethod
	
	public void logout() {
		
	driver.close();
		System.out.println("Logout Successful");
	}

}
