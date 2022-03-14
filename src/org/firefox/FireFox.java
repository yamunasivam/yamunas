package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
