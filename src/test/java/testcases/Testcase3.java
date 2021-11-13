
package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;


public class Testcase3 {

@Test
public void varifyLogin() {

		
		System.setProperty("webdriver.chrome.driver","C:\\Apeksha\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// open the url
		driver.get("http://automationpractice.com/index.php/");
		Reporter.log("Website launched");
		
		// maximize the window
		driver.manage().window().maximize();
		Reporter.log("Maximize window");
		
		// click on the signin button
		driver.findElement(By.linkText("Sign in")).click();
		Reporter.log("SIgn in");
				
	
				
		// sign in the account
		driver.findElement(By.cssSelector("input#email")).sendKeys("aapeksha_doctor@yahoo.com");
		driver.findElement(By.cssSelector("input#passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		Reporter.log("Enter login password");
				
		// open the personal information 
		driver.findElement(By.id("my-account")).click();
		driver.findElement(By.className("icon-user")).click();
		
		// Add the personal information
		// Select the radio button /gender button
		driver.findElement(By.id("id_gender2")).click();
		
		//Enter the first name and last name ,email.
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("Apeksha");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("D");
		driver.findElement(By.id("email")).sendKeys(" ");
		
		// Enter the DOB
		driver.findElement(By.id("days")).sendKeys("26");
		driver.findElement(By.id("months")).sendKeys("May");
		driver.findElement(By.id("years")).sendKeys("1995");
		
		//Enter the Password, new password, confirm password
		driver.findElement(By.id("old_passwd")).sendKeys("123456");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("confirmation")).sendKeys("123456");
		
		// Click on sign up, special offers check box
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("optin")).click();
		
		//Click on save button
		driver.findElement(By.name("submitIdentity")).click();
		
		
		// close the url
		driver.quit();

		
	
	}

}
