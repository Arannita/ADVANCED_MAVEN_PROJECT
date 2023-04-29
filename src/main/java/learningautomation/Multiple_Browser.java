package learningautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browser {
	public static String browserName = "edge";
	public static WebDriver driver;
	 
	
	public static void main(String[] args) {
		
		
		
		
		if(browserName.equals("chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://rediff.com");
			driver.quit();
		}else if(browserName.equals("firefox")) {
			    WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://flipkart.com");
				driver.quit();
			}else if(browserName.equals("edge")) {
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("http://amazon.com");
				driver.quit();
				
			}else {
				System.out.println("Nothing opened");
			}
	}
}

		
		


