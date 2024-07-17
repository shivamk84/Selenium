package testNgConcepts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Amazon {

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

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");

		// Pop up Close
		try {
			WebElement toastremove1 = driver.findElement(By.xpath("//div[@class='a-section glow-toaster glow-toaster-theme-default glow-toaster-slot-default nav-coreFlyout nav-flyout']//input[@data-action-type='DISMISS']"));
			toastremove1.click();
		} catch (Exception e) {
			System.out.println("Exception Occurred....");
		}

		// Today's Deals button click
		driver.findElement(By.xpath("//a[@class='nav-a  '][1]")).click();

		// See more Button click
		driver.findElement(By.xpath("//button[@class='SeeMoreButton-module__container_j2YuDOVGk8QHFxg6xPQk']")).click();

		// Software product select
		driver.findElement(By.xpath("//span[text()='Books']")).click();

		// First Product select
		driver.findElement(By.xpath("//div[@class='a-section ProductCardImage-module__wrapper_YgLz4kq6ekChj01qeqOf']")).click();

		// Radio Button
		driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']")).click();

		// Add to Cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		// Pop up Close
		try {
			WebElement toastremove = driver.findElement(By.xpath("//div[@class='a-section glow-toaster glow-toaster-theme-default glow-toaster-slot-default nav-coreFlyout nav-flyout']//input[@data-action-type='DISMISS']"));
			toastremove.click();
		} catch (Exception e) {
			System.out.println("Exception Occurred....");
		}

		String llElement = driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]")).getText();
		
		as.assertEquals("Added to Cart", llElement);
		as.assertAll();
		System.out.println("Added successfully......");
		
		driver.quit(); // quit close the instance and release the memory
		// driver.close(); // close the only current tab and does not release the memory, only the current tab will be close	
		
		
	}
	
	
	
	@Test
	public void MoviesAndTv() {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");

		// Pop up Close
		try {
			WebElement toastremove1 = driver.findElement(By.xpath("//div[@class='a-section glow-toaster glow-toaster-theme-default glow-toaster-slot-default nav-coreFlyout nav-flyout']//input[@data-action-type='DISMISS']"));
			toastremove1.click();
		} catch (Exception e) {
			System.out.println("Exception Occurred....");
		}

		// Today's Deals button click
		driver.findElement(By.xpath("//a[@class='nav-a  '][1]")).click();

		// See more Button click
		driver.findElement(By.xpath("//button[@class='SeeMoreButton-module__container_j2YuDOVGk8QHFxg6xPQk']")).click();

		// Software product select
		driver.findElement(By.xpath("//span[text()='Movies & TV']")).click();

		// First Product select
		driver.findElement(By.xpath("//div[@class='a-section ProductCardImage-module__wrapper_YgLz4kq6ekChj01qeqOf']")).click();

		// Radio Button
		driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']")).click();

		// Add to Cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		// Pop up Close
		try {
			WebElement toastremove = driver.findElement(By.xpath("//div[@class='a-section glow-toaster glow-toaster-theme-default glow-toaster-slot-default nav-coreFlyout nav-flyout']//input[@data-action-type='DISMISS']"));
			toastremove.click();
		} catch (Exception e) {
			System.out.println("Exception Occurred....");
		}

		String llElement = driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]")).getText();
		
		as.assertEquals("Added to Cart", llElement);
		as.assertAll();
		System.out.println("Added successfully......");
		
		driver.quit(); // quit close the instance and release the memory
		// driver.close(); // close the only current tab and does not release the memory, only the current tab will be close
		
		
		
		
		
	}

	
	@Test
	public void MusicalInstruments() {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");

		// Pop up Close
		try {
			WebElement toastremove1 = driver.findElement(By.xpath("//div[@class='a-section glow-toaster glow-toaster-theme-default glow-toaster-slot-default nav-coreFlyout nav-flyout']//input[@data-action-type='DISMISS']"));
			toastremove1.click();
		} catch (Exception e) {
			System.out.println("Exception Occurred....");
		}

		// Today's Deals button click
		driver.findElement(By.xpath("//a[@class='nav-a  '][1]")).click();

		// See more Button click
		driver.findElement(By.xpath("//button[@class='SeeMoreButton-module__container_j2YuDOVGk8QHFxg6xPQk']")).click();

		// Software product select
		driver.findElement(By.xpath("//span[text()='Musical Instruments']")).click();

		// First Product select
		driver.findElement(By.xpath("//div[@class='a-section ProductCardImage-module__wrapper_YgLz4kq6ekChj01qeqOf']")).click();

		// Radio Button
		driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']")).click();

		// Add to Cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		// Pop up Close
		try {
			WebElement toastremove = driver.findElement(By.xpath("//div[@class='a-section glow-toaster glow-toaster-theme-default glow-toaster-slot-default nav-coreFlyout nav-flyout']//input[@data-action-type='DISMISS']"));
			toastremove.click();
		} catch (Exception e) {
			System.out.println("Exception Occurred....");
		}

		String llElement = driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]")).getText();
		
		as.assertEquals("Added to Cart", llElement);
		as.assertAll();
		System.out.println("Added successfully......");
		
		driver.quit(); // quit close the instance and release the memory
		// driver.close(); // close the only current tab and does not release the memory, only the current tab will be close	
		
		
	}
		

}
