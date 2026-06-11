package may82026Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JobQuicker extends BaseClass
{
	@Test
	public void jobs() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//span[contains(text(),'All Categories')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Jobs']")).click();
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.id("query"));
		search.sendKeys("Testing");
		Thread.sleep(3000);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//button[text()='Apply Now']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}
}
