package Automation_assert;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class automationAssert {
	
	WebDriver driver; 
  @Test
  public void autologin() {
	// click on the signin button
			driver.findElement(By.linkText("Sign in")).click();
			
			
			// sign in the account
			driver.findElement(By.cssSelector("input#email")).sendKeys("aapeksha_doctor@yahoo.com");
			driver.findElement(By.cssSelector("input#passwd")).sendKeys("123456");
			driver.findElement(By.id("SubmitLogin")).click();
			
			String actualTitle=driver.getTitle();
			String expectedTitle = "My account - My Store";
			Assert.assertEquals(actualTitle, expectedTitle);
					
					
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Apeksha\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		// open the url
		driver.get("http://automationpractice.com/index.php/");
		
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	
	  
	  
  }






}



	
	

