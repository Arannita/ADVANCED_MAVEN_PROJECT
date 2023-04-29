package com.testngcode_8thApril_2023;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG {
	
	
	
public WebDriver driver;
@Test
public void rediffLogin() throws IOException{
	driver = new ChromeDriver ();
	driver.manage().window().maximize();
	System.out.println("");
}
}
