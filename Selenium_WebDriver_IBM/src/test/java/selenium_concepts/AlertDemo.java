package selenium_concepts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertDemo {

	static WebDriver driver;
	static String browser = "firefox";

	@Test
	public void Books() throws IOException {
		SoftAssert as = new SoftAssert();
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize(); // maximize browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("proceed")).click();

		// Alert
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text = : " + alert.getText());

		as.assertEquals(alert.getText(), "Please enter a valid user name");
		// handle alert
		alert.accept();
		// alert.dismiss();

		// Enter a username
		driver.findElement(By.id("login1")).sendKeys("tester");
		as.assertAll();

	}

}
