package org.chrome;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.ui.Robot;

public class MoveOver {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.t-mobile.com/?src=spr&rdpage=/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement btn1 = driver.findElement(By.xpath("//button[contains(@target,'_self' )]"));
	btn1.click();
	Thread.sleep(3000);
	WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'tntOverlayCloseBtn')]"));
	btn.click();
	WebElement Drp = driver.findElement(By.xpath("//a[text()='Phones & devices']"));
	Actions actions =new Actions(driver);
	actions.moveToElement(Drp).perform();
	Thread.sleep(3000);
	WebElement InnerDrp = driver.findElement(By.xpath("//a[text() = '5G phones']"));
	
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	
	executor.executeScript("arguments[0].click();", InnerDrp);
	
}
}
