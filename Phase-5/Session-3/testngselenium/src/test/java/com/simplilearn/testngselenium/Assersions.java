package com.simplilearn.testngselenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Assersions {

	WebDriver driver = null;
	SoftAssert soft = null;

	@Test
	public void titleTest() {
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		soft.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
		soft.assertAll();
		driver.close();
	}
	
	@Test
	public void login() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("charan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Charan@123");
		driver.findElement(By.name("login")).submit();
		
		soft.assertAll();
		driver.close();
	}


	@BeforeMethod
	public void beforeMethod() {
		soft = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		soft = null;
	}

}