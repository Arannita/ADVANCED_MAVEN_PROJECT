package com.weekend.batch.ADVANCED_MAVEN_PROJECT;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Driver;

public class LoginforTutorialsninjademo {

	public static void main(String[] args) {
		ChromeOptions options;
	}
		
		@BeforeMethod
		public void setup() {
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://rediff.com");
			
			

	}

		
		@Test
		public void testOne()throws InterruptedException {
			driver=new EdgeDriver();
			
			
			
			
				
		}
}
