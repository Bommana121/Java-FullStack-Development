package com.simplilearn.Phase5PracticeProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
  @Test
  public void launchFB() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test(dependsOnMethods = { "launchFB" })
	public void login() {
		driver.findElement(By.id("email")).sendKeys("charan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Charan@123");
		driver.findElement(By.name("login")).submit();
	
	}
}
