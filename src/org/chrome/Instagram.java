package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
			
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Yamuna007");
		WebElement Passwrd = driver.findElement(By.name("password"));
		Passwrd.sendKeys("12345678");
			 
		
		}


}


