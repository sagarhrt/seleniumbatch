package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com");
	WebElement popup = driver.findElement(By.xpath("//a[@data-gaaction=\"popup.auth.close\"]"));
	popup.click();
	
}
}