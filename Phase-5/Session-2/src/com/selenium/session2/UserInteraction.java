package com.selenium.session2;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class UserInteraction {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.google.co.in/");
		        
		        WebElement query= driver.findElement(By.name("q"));
		        
		        Actions builder= new Actions(driver);
		        
		        org.openqa.selenium.interactions.Action myAction= builder.moveToElement(query)
		                .click()
		                .keyDown(query,Keys.SHIFT)
		                .sendKeys(query,"charan")
		                .keyUp(query,Keys.SHIFT)
		                .doubleClick()
		                .contextClick()
		                .build();
		        myAction.perform();
		        
		        driver.close();
	}
}
