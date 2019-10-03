package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googleclick {
	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx PZPZlf gsmt']/span[contains(.,'Java')]"));
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();
		Robot r =  new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		

		
		
	}

}
