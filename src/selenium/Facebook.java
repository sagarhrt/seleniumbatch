package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
	email.sendKeys("sagarhiremath71@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
	password.sendKeys("sagarhiremath71@gmail.com");
	WebElement submit = driver.findElement(By.xpath("//button[@type=\"button\"]]"));
	submit.click();
	
}
}
