package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement username = driver.findElement(By.id("email"));
username.sendKeys("yamuna@gmail.com");
WebElement passwrd = driver.findElement(By.id("pass"));
passwrd.sendKeys("12345678");




}}
