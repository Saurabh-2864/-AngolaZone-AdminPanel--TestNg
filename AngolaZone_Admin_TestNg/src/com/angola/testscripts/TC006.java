package com.angola.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC006 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://angolazone-admin.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
	}
	
	
	
	
	

	@Test (priority=6,groups="Categories")
	public void ClickOnSearch() throws Exception{
		
		driver.findElement(By.id("email")).sendKeys("bhupinder.singh@ideausher.com");
        driver.findElement(By.name("password")).sendKeys("123456");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();
		 Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();
         Thread.sleep(5000);
		
		
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys("Books");
    System.out.println("Click On Search Categories option & Enter Books");
    Thread.sleep(6000);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	}
	
@AfterMethod
	
	public void logout() {
		
	driver.close();
		System.out.println("Logout Successful");
	}

	
}
