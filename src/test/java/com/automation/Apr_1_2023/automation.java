package com.automation.Apr_1_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class automation {

public static WebDriver driver; 

			
			
			@Test
			public void mouseActionsTest() {
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://browserstack.com");
				Actions action=new Actions(driver);
				
				WebElement getADemoButton=driver.findElement(By.xpath("//div[@class='relative']/preceding::button[1]"));
				action.moveToElement(getADemoButton);
				
				WebElement getStartedFreeButton1 = driver.findElement(By.id("signupModalButton"));
				action.moveToElement(getStartedFreeButton1).contextClick().perform();


				WebElement getStartedFreeButton = driver.findElement(By.id("signupModalButton"));
				action.moveToElement(getStartedFreeButton).click().perform();
				
				
				
	}

}







