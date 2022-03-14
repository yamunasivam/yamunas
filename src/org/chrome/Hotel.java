package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Hotel {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("yamuna123");
		WebElement Passwrd = driver.findElement(By.id("password"));
		Passwrd.sendKeys("yamuna007");
		WebElement Login = driver.findElement(By.id("login"));
		Login.click();
		WebElement Search = driver.findElement(By.id("location"));
		//Select s =new Select(Search);
		//s.selectByIndex(2);
	}

			
	
}