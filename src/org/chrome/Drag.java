package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement Acct = driver.findElement(By.id("credit2"));
	WebElement Amt = driver.findElement(By.id("bank"));
	Actions actions =new Actions(driver);
	actions.dragAndDrop(Acct, Amt).perform();
	Thread.sleep(6000);
	WebElement Acct1 = driver.findElement(By.id("fourth"));
	WebElement Amt1 = driver.findElement(By.id("amt7"));
	Actions actions1 =new Actions(driver);
	actions1.dragAndDrop(Acct1, Amt1).perform();
	Thread.sleep(6000);
	WebElement Acct2 = driver.findElement(By.id("credit1"));
	WebElement Amt2 = driver.findElement(By.id("loan"));
	Actions actions2 =new Actions(driver);
	actions2.dragAndDrop(Acct2, Amt2).perform();
	Thread.sleep(6000);
	WebElement Acct3 = driver.findElement(By.id("fourth"));
	WebElement Amt3 = driver.findElement(By.id("amt8"));
	Actions actions3 =new Actions(driver);
	actions3.dragAndDrop(Acct3, Amt3).perform();
	Thread.sleep(6000);
	WebElement Texttit = driver.findElement(By.xpath("//a[contains(@class,'button button-green')]"));
	String text = Texttit.getText();
	System.out.println(text);

	
	}

}
