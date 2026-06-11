package may82026Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegisterQuicker extends BaseClass
{
	@Test
	public void register() throws InterruptedException
	{
				
				driver.findElement(By.xpath("//label[text()='Login/Register']")).click();

				Thread.sleep(3000);
		
				WebElement mobile = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
				mobile.sendKeys("9106535929");

				Thread.sleep(2000);

				WebElement continuebutton = driver.findElement(By.xpath("//button[text()='Continue']"));
				continuebutton.click();

				Thread.sleep(3000);

				driver.quit();
			}
	}

