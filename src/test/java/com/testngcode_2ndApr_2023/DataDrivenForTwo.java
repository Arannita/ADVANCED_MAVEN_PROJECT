package com.testngcode_2ndApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenForTwo {

	public WebDriver driver;

	public void loginNinjaTest(String username, String password) {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://tutorialsninja.com/demo");

		driver.findElement(By.linkText("My Account")).click();

		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys(username);

		driver.findElement(By.id("input-password")).sendKeys(password);

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	public void loginRediffTest(String username, String password) {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rediff.com/");

		driver.findElement(By.linkText("My Account")).click();

		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys(username);

		driver.findElement(By.id("input-password")).sendKeys(password);

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

}
