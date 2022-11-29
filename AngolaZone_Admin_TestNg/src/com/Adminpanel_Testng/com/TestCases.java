package com.Adminpanel_Testng.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
	
	
WebDriver driver;
		
		@BeforeMethod
		public void setup() {
		
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://angolazone-admin.herokuapp.com/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		}
		
		
		@Test   (priority=1,groups="Login")    //(dependsOnMethods="setup")   
		
		public void EnterUrl() {
			
			System.out.println("Enter Url Successful");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		}
		
		@Test (priority=2,groups="Login")
		
		public void EnterEmailID() throws Exception{
		 driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
        System.out.println("Entered E-mail Id");
        Thread.sleep(3000);
		}
        
		@Test (priority=3,groups="Login")
		public void EnterPassword() throws Exception{
		
        driver.findElement(By.name("password")).sendKeys("123456");
        System.out.println("Password Entered");
        Thread.sleep(3000);
		}
			
		@Test (priority=4,groups="Login")
		public void ClickOnLogin() throws Exception{
			
			 driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
		        driver.findElement(By.name("password")).sendKeys("123456");

			
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();
        System.out.println("Login Successful");
	    Thread.sleep(8000);
		}
		
		@Test (priority=5,groups="Categories")
		public void ClickonCategories() throws Exception{
			 driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
		        driver.findElement(By.name("password")).sendKeys("123456");
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();
		    System.out.println("Click on categories option");
		    Thread.sleep(8000);
		}
		
		@Test (priority=6,groups="Categories")
		public void ClickOnSearch() throws Exception{
			
			driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
	        driver.findElement(By.name("password")).sendKeys("123456");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();
			 Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();

			
			
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys("Books");
	    System.out.println("Click On Search Categories option & Enter Books");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		}
		
		@Test (priority=7,groups="Categories")
		public void EnterServices() throws Exception{
			
			driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
	        driver.findElement(By.name("password")).sendKeys("123456");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();//Login
			 Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();//Click on Categories

			
			
			
			
			
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys("Services");
			    Thread.sleep(5000);
			    System.out.println("Entered Data Services");
			    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
			    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
			    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
			    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
			    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
			    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
			    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
			    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
			    
		}
		
		@Test (priority=8,groups="Categories")
		public void AddCategories() throws Exception{
			
			driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
	        driver.findElement(By.name("password")).sendKeys("123456");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();//Login
			 Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();//Click on Categories
              Thread.sleep(3000);
			
			
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/a/button")).click();
			    System.out.println("Click On Add Categories Button");
			    Thread.sleep(6000);
		}
		
		@Test (priority=9,groups="categories")
		public void AddCategoryChecked () throws Exception{
			
			driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
	        driver.findElement(By.name("password")).sendKeys("123456");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();//Login
			 Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();//Click on Categories
              Thread.sleep(3000);
			
			
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/a/button")).click();
			    System.out.println("Click On Add Categories Button");
			    Thread.sleep(6000);
			
		
		         
		
		 driver.findElement(By.name("categoryName")).sendKeys("Pots");
	    Thread.sleep(3000);
	    System.out.println("Category Name Entered Successfully");
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[2]/textarea")).sendKeys("This Category is used only for Used Pots");
	    Thread.sleep(3000);
	    System.out.println("Category Description Entered Successfully");
	    
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[3]/button[1]")).click();
	 Thread.sleep(6000);
	 System.out.println("Click on Save Button");
	 
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[3]/button[2]")).click();
	 Thread.sleep(8000);
	 System.out.println("Click on cancel button");
	 
}	
		
		@Test (priority=10,groups="Categories")
		
		
		public void clickOnEdit() throws Exception{
			driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
	        driver.findElement(By.name("password")).sendKeys("123456");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();//Login
			 Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();//Click on Categories
              Thread.sleep(3000);
			
			
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/a/button")).click();
			    System.out.println("Click On Edit Categories Button");
			    Thread.sleep(6000);
			
			
			
			
			   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/table/tbody/tr[1]/td[6]/div/button[1]/img")).click();
			    Thread.sleep(3000);
			    System.out.println("Click on Edit Category");
		}
		
		
		
	
		
		@AfterMethod
		
		public void logout() {
			
		driver.close();
			System.out.println("Logout Successful");
		}
			
			
			
			
			
			
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
