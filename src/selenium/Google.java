package selenium;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Google {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx PZPZlf gsmt']/span[contains(.,'Java')]"));
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();
		
		
		
	}
		
	}


