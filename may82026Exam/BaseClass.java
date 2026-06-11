package may82026Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;


public class BaseClass 
{
	WebDriver driver;
	@Parameters("browser")

	@BeforeMethod
	public void launch(String nameofbrowser) throws InterruptedException
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}

		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}

		if(nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		driver.get("https://www.quikr.com/");

		Thread.sleep(5000);

		// Handle popup
		WebElement popup = driver.findElement(
		By.xpath("//span[text()='NOT NOW']/parent::button"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", popup);

		Thread.sleep(2000);
	}

	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}