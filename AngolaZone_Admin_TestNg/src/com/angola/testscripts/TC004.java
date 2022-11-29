package com.angola.testscripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC004 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://angolazone-admin.herokuapp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	}
	
	
	
	@Test (priority=4,groups="Login")
	public void ClickOnLogin() throws Exception{
		
		 driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
	        driver.findElement(By.name("password")).sendKeys("123456");
	        
	        
	    	
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();
	        System.out.println("Login Successful");
		    Thread.sleep(8000);
			}
	
@AfterMethod
	
	public void logout() {
		
	driver.close();
		System.out.println("Logout Successful");
	}
	

}
