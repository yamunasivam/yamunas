package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IcIci {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\hp\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement username = driver.findElement(By.xpath("//input[contains(@class,'login-input type_UserPrincipal')]"));
	username.sendKeys("Yamuna");
	WebElement passwrd = driver.findElement(By.xpath("onpaste=\"return false"));
	passwrd.sendKeys("yamuna007");
	
	
	}
}


