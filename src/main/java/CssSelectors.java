import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class CssSelectors {

	public static WebDriver driver;


	@BeforeMethod
	public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		
	}

	@Test
	public void clickOnSignInLink() {

		driver.findElement(By.cssSelector("a.signin")).click();

		}
	@Test
	public void loginCredentials() {

		driver.findElement(By.cssSelector("a.signin")).click();
        driver.findElement(By.cssSelector(null))
		}
 }

