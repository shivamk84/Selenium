package selenium_concepts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class TakeScreenshotExample {

	SoftAssert as = new SoftAssert();
	static WebDriver driver;
	static String browser = "chrome";

	@Test
	public void Books() throws IOException {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.com");

		// TakeScreenshot
//		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(f,new File("C:\\Users\\ShivamKhatkale\\Selenium-IBM\\Selenium_WebDriver_IBM\\Files\\Test1.png"));

		// Shutterbug.shootPage(driver).withName("Test_N.png").save();
		Shutterbug.shootPage(driver, Capture.FULL).withName("FullScreenshot").save();

		// screen shot of an element- primeday logo
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		Shutterbug.shootElement(driver, logo).withName("Logo").save();

	}
}