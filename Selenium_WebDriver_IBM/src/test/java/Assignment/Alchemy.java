package Assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Alchemy {

	static WebDriver driver;
	static String browser = "chrome";
	
	
	public void DefaultCode() {



		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://alchemy.hguy.co/crm/");

		driver.manage().window().maximize(); // maximize browser window
	}
	
	public void login() {

		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
		
	}

	@Test
	public void VerifyTitle() {


		DefaultCode();

		SoftAssert as1 = new SoftAssert();

		login();

		as1.assertEquals(driver.getTitle(), "SuiteCRM");
		as1.assertAll();

		System.out.println("Successfully Match...");
		
		driver.close();
	}

	@Test
	public void URLHeaderIMG() {

		SoftAssert as = new SoftAssert();
		DefaultCode();

		System.out.println(driver.findElement(By.xpath("//div//a[@title='SuiteCRM']")).getAttribute("href"));
		driver.close();
		
	}

	@Test
	public void CopyrightText() {
		
		DefaultCode();
		System.out.println(driver.findElement(By.xpath("//a[@id='admin_options']")).getText());
		driver.close();
	}

	@Test
	public void LoggingIntoSite() {

		
		DefaultCode();
		login();	
		
		SoftAssert as1 = new SoftAssert();
		
	    String URL = driver.getCurrentUrl();
		
	    as1.assertEquals(URL, "https://alchemy.hguy.co/crm/index.php?module=Home&action=index");	
	    as1.assertAll();
	    System.out.println("Homepage Landed Successfully....");
	    driver.close();
		
	}
	
	@Test
	public void GettingColors() {
		
		DefaultCode();
		login();
		
		Color loginButtonColour = Color.fromString(driver.findElement(By.xpath("//div[@class='navbar-header']")).getCssValue("color"));
		System.out.println(loginButtonColour);
		driver.close();
	}

	@Test
	public void MenuChecking() {

		
		DefaultCode();
		login();
		
		WebElement ll = driver.findElement(By.id("grouptab_3"));
		Assert.assertTrue(ll.isDisplayed());
		Assert.assertTrue(ll.isEnabled());
		driver.close();
		
	}

	@Test
	public void ReadingAddnInfor() {


		
		DefaultCode();
		login();
		
		driver.findElement(By.xpath("//a[text()='Sales']")).click();
		driver.findElement(By.cssSelector("#moduleTab_9_Leads")).click();
		
		driver.findElement(By.xpath("(//span[@class='suitepicon suitepicon-action-info'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='open ui-dialog-content ui-widget-content']//span[@class='phone']")).getText());
		driver.close();
		
	}
	
	@Test
	public void TraversingTables() {

		DefaultCode();
		login();
		
		driver.findElement(By.xpath("//a[text()='Sales']")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
	    List<WebElement> ll	= driver.findElements(By.xpath("//tbody//tr//td[@field='name']"));
		
	    for (int i = 0; i < 10; i+=2) {
			System.out.println(ll.get(i).getText());
	    }
	    driver.close();
	    
		
	}
	
	@Test
	public void TraversingTables2() {

		
		DefaultCode();
		login();
		

		driver.findElement(By.xpath("//a[text()='Sales']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		List<WebElement> nameElements = driver.findElements(By.xpath("//tbody//tr//td[@field='name']"));	
	    List<WebElement> userElements = driver.findElements(By.xpath("//tbody//tr//td[@field='assigned_user_name']"));

	    for(int i = 0; i < 10; i++) {
	    	System.out.println("Name : "+ nameElements.get(i).getText() +" User : "+ userElements.get(i).getText());
	    }
	    driver.close();
		
	}
	
	@Test
	public void CountingDashlets() {
		
		DefaultCode();
		login();
		
		
		List<WebElement>ll =  driver.findElements(By.xpath("//td[@class='dashlet-title']"));
		
		System.out.println("Size of dashlet " +ll.size());
		
		int index = 1;
		for(WebElement x : ll) {
			System.out.println(index++ +" "+ x.getText());
		}
		
		driver.close();
	
	}

	@Test
	public void ScheduleMeeting() {


		
		DefaultCode();
		login();
		
		String name = "Shivai";
		
		driver.findElement(By.xpath("//a[text()='Activities']")).click();
		
		driver.findElement(By.xpath("//ul//li//a[text()='Meetings']")).click();
		
		driver.findElement(By.xpath("//div[text()='Schedule Meeting']")).click();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		driver.findElement(By.xpath("//div[text()='View Meetings']")).click();
	   
	    Assert.assertEquals( driver.findElement(By.xpath("(//td[@field='name'])[1]")).getText(), name);
	    
	    System.out.println("Successfully passed........");
	    driver.close();
		
	}
		
	@Test
	public void CreatingProdcut() {


		
		DefaultCode();
		login();
		
		
		driver.findElement(By.xpath("//a[text()='All']")).click();
		
		driver.findElement(By.xpath("//ul//li//a[text()='Products']")).click();
		
		driver.findElement(By.xpath("//span[@class='suitepicon suitepicon-action-create']")).click();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Apple");

		driver.findElement(By.xpath("//input[@id='price']")).sendKeys("86383");
		
		driver.findElement(By.xpath("(//input[@value='Save'])[2]")).click();
		
		driver.findElement(By.xpath("//div[text()='View Products']")).click();
		
		driver.close();
		
		
	}
	
	@Test
	public void FilterOpportunities() {
		
		DefaultCode();
		login();

		driver.findElement(By.xpath("//a[text()='Sales']")).click();

		driver.findElement(By.xpath("//ul//li//a[text()='Opportunities']")).click();
		
		driver.findElement(By.xpath("//a[@title='Filter']")).click();
		
		driver.findElement(By.xpath("//a[text()='Advanced Filter']")).click();
		
		driver.findElement(By.xpath("//option[@label='Less Than']")).click();
		
		// Assigned To 
		driver.findElement(By.xpath("//option[@label='sarah']")).click();
	
		// Sales Page
		driver.findElement(By.xpath("//option[@label='Perception Analysis']")).click();
		
		// Lead Source
		driver.findElement(By.xpath("//option[@label='Web Site']")).click();

		// Directions
		driver.findElement(By.xpath("//input[@id='sort_order_desc_radio']")).click();
		
		// Click Search Button
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		// Print name only
		List<WebElement>li = driver.findElements(By.xpath("//tbody//tr//td[@field='name']"));

		for(int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
		}
		
		// Reset Button
		driver.findElement(By.xpath("//li[@class='sugar_action_button desktopOnly']")).click();
		
		driver.close();
		
		
	}
	
	
}



