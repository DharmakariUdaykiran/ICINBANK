package com.AutomationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeDriverExample {
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\udharmakari\\Tools\\drivers\\chromedrivernew.exe");
				WebDriver driver = new ChromeDriver();

				driver.get("http://localhost:4200\\");
				driver.findElement(By.name("email")).sendKeys("udaykirandharmakari@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Udaykiran@0123");
				Thread.sleep(3000);
				driver.findElement(By.id("loginButton")).click();
				driver.findElement(By.className("div top-section")).click();
				driver.findElement(By.tagName("a")).click();
				
				Thread.sleep(3000);

				driver.close();

		
	}

}