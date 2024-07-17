package selenium_concepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TakeScreenshotExample {

	SoftAssert as = new SoftAssert();
	static WebDriver driver;
	static String browser = "edge";

	@Test
	public void Books() {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// TakeScreenshot
		
		
	}
}