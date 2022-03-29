package com.selenium.session3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationAndLogin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		 driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		 
		 driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content")).sendKeys("charan123@gmail.com");
		
	        WebElement pass= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
	        pass.sendKeys("Charan12@");
	        
	        WebElement pass1= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
	        pass1.sendKeys("Charan12@");
	        
	        Select country= new Select (driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content")));
	        country.selectByVisibleText("India");
	        
	        WebElement firstname= driver.findElement(By.id("sView1:r1:0:firstName::content"));
	        firstname.sendKeys("charan");
	        
	        WebElement lastname= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
	        lastname.sendKeys("kumar");
	        
	        WebElement jobtitle= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
	        jobtitle.sendKeys("Associate Software Engineer");
	        
	        WebElement workphone= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
	        workphone.sendKeys("6358791252");

	        
	        WebElement compname= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
	        compname.sendKeys("Mphasis");
	        
	        WebElement address1= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
	        address1.sendKeys("Hooghly , Kolkata");
	        
//	        WebElement address2= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address2\\:\\:content"));
//	        address2.sendKeys("");
	        
	        WebElement city= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
	        city.sendKeys("Kolkata");
	        
	        Select state= new Select(driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content")));
	        state.selectByVisibleText("West Bengal");
	        
	        WebElement zip= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
	        zip.sendKeys("712125");    
	        
	        WebElement link = driver.findElement(By.linkText("Create Account"));
			link.click();
	        
	        JavascriptExecutor je= (JavascriptExecutor)driver;
			je.executeScript("window.open('https://login.oracle.com/mysso/signon.jsp?request_id=007')");
			
			ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
			//switch
			driver.switchTo().window(tabs.get(1));
			
			
			 WebElement username = driver.findElement(By.xpath("//*[@id=\"sso_username\"]"));
		     username.sendKeys("charan123@gmail.com");
		        
		     WebElement pass2 = driver.findElement(By.xpath("//*[@id=\"ssopassword\"]"));
		     pass2.sendKeys("Charan12@");
		     
		     WebElement button= driver.findElement(By.xpath("//*[@id=\"signin_button\"]"));
		     button.submit();      
	}
}
