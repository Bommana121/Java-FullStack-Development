package com.selenium.session2;




	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ShineRegistraion {


		public static void main(String[] args) {
			
		
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
			        WebDriver driver = new ChromeDriver();
			        
			        driver.get("https://www.shine.com/registration/parser/");
			        
			        WebElement name= driver.findElement(By.cssSelector("#id_name"));
			        name.sendKeys("charan");
			        
			        WebElement email= driver.findElement(By.cssSelector("#id_email"));
			        email.sendKeys("charan@gmail.com");
			        
			        WebElement num= driver.findElement(By.cssSelector("#id_cell_phone"));
			        num.sendKeys("6358791252");
			        
			        WebElement pass= driver.findElement(By.cssSelector("#id_password"));
			        pass.sendKeys("charan12");
			        
			        WebElement check= driver.findElement(By.cssSelector("#id_privacy"));
			       
			        System.out.println(check.isSelected());
			        
			        if(!check.isSelected())
			        {
			            check.click();
			            System.out.println("Check box selected");
			        }
			        System.out.println(check.isSelected());
			        WebElement button= driver.findElement(By.cssSelector("#registerButton"));
					button.submit();
	}
	}

