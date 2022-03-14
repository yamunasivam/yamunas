package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutometionTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	Address.sendKeys("Yamuna007");
	WebElement RadioBtn = driver.findElement(By.xpath("//input[@name='radiooptions'][1]"));
	RadioBtn.click();
	
	}
}
