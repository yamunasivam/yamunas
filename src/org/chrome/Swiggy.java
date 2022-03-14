package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\hp\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	WebElement Location = driver.findElement(By.id("location"));
	Location.sendKeys("KFC");
		
	
	}
}


