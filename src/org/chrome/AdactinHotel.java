package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://adactinhotelapp.com/");
				driver.manage().window().maximize();
				WebElement Title = driver.findElement(By.xpath("//p[contains(text(),'Launches ')]"));
				String text = Title.getText();
				System.out.println(text);
				//driver.quit();
		
	}

	}


