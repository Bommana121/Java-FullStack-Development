package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcaSjSJa5WH70vcmaIcfVCXjVxh1yNioZD0Gdpo27IeJ9qqp8HpNhtbDlnNFR-ELWPYJHK8RdkVamE9u6NjAqLruRhoA5Km4s2Z2unz-5yxyQ&smuh=22637&lh=Ac-Om2JXE22xjdR6oS4");
		/*WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		System.out.println(email.getAttribute("placeholder"));
		
		WebElement email1 = driver.findElement(By.cssSelector("#email"));
		System.out.println(email1.getAttribute("placeholder"));
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		System.out.println(pass.getAttribute("placeholder"));
		
		WebElement pass1 = driver.findElement(By.cssSelector("#pass"));
		System.out.println(pass1.getAttribute("placeholder"));*/
	
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	
		email.sendKeys("viratkohli13@gmail.com");
		pass.sendKeys("virat");
		WebElement button = driver.findElement(By.name("login"));
		
	
		
		button.click();
	
	}
 
}
