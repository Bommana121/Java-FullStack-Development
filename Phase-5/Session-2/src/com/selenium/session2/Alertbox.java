package com.selenium.session2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		        
		        WebElement button1= driver.findElement(By.name("alertbox"));
		        button1.click();
		        
		        System.out.println(driver.switchTo().alert().getText());
		        driver.switchTo().alert().accept();

}
} 