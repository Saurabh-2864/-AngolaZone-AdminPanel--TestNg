package com.angola.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC003 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://angolazone-admin.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
	}
	
	
	 
	@Test (priority=3,groups="Login")
	public void EnterPassword() throws Exception{
	
    driver.findElement(By.name("password")).sendKeys("123456");
    System.out.println("Password Entered");
    Thread.sleep(3000);
	}
@AfterMethod
	
	public void logout() {
		
	driver.close();
		System.out.println("Logout Successful");
	}

}
