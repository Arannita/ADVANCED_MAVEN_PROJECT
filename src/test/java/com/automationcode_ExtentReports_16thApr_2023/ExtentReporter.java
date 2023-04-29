package com.automationcode_ExtentReports_16thApr_2023;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static void generateExtentReport() throws Throwable {
	
	
	ExtentReports extentReport = new ExtentReports();
	File extentReportFile = new File (System.getProperty("user.dir")+ "//test-output//ExtentReports//extentreport.html");
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
	sparkReporter.config().setTheme(Theme.DARK);
	sparkReporter.config().setReportName("TN Automation Results");
	sparkReporter.config().setDocumentTitle("TNReportTitle|Automation|Results");
	sparkReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss");
	
	
	extentReport.attachReporter(sparkReporter);
	
	
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\automationcode_ExtentReports_16thApr_2023\\config.properties");
	prop.load(ip);
	
	
	extentReport.setSystemInfo("application url", prop.getProperty("url"));
	extentReport.setSystemInfo("browser name", prop.getProperty("browser"));
	extentReport
	
	
	
	
	
	}

}
