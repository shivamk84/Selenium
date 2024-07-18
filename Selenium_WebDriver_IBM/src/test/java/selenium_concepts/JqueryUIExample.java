package selenium_concepts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class JqueryUIExample {

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

		driver.get("https://jqueryui.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Selectable']")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		driver.findElement(By.xpath("//ol[@id='selectable']//li[4]")).click();

		// driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")).click();

		// driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// Sequential frames
		/*
		 * driver.switchTo().frame(0); driver.findElement(By.xpath("")).sendKeys("t1");
		 * driver.switchTo().defaultContent(); driver.switchTo().frame(1);
		 * driver.findElement(By.xpath("")).sendKeys("t2");
		 * driver.switchTo().defaultContent(); driver.switchTo().frame(2);
		 */

		/*
		 * driver.switchTo().frame(0); driver.switchTo().parentFrame(); //- switch
		 * driver ref to parent frame
		 * driver.switchTo().parentFrame().switchTo().parentFrame(); //- Grand parent
		 * frame
		 * 
		 * 
		 * driver.switchTo().frame(0); driver.switchTo().frame(1); 
		 * // OR
		 * driver.switchTo().frame(0).switchTo().frame(1);
		 */

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[text()='Droppable']")).click();

		driver.quit();

	}

}
