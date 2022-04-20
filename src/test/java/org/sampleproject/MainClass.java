package org.sampleproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("sample project 2");

				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			/*	WebElement txtUser = driver.findElement(By.id("email"));
				txtUser.sendKeys("Ashwini");
				WebElement txtPass = driver.findElement(By.id("pass"));
				txtPass.sendKeys("65ryvhuf6");
				WebElement btnLogin = driver.findElement(By.name("login"));
				btnLogin.click();
		*/
	}

}
