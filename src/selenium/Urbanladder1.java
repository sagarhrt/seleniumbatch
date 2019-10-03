package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(10000);
		WebElement popup = driver.findElement(By.xpath("//a[@data-gaaction=\"popup.auth.close\"]"));
		popup.click();/*
						 * WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
						 * System.out.println(sale.getText());
						 */
		Actions a = new Actions(driver);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		for (WebElement item : menu) {
			String name = item.getText();
			System.err.print(name);
			a.moveToElement(item).perform();
			Thread.sleep(1000);
	     List<WebElement>	submenu  = driver.findElements(By.xpath("//span[contains(.,'Sale')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li")); 
		for (WebElement subitem : submenu) {
			System.out.println(subitem.getText());
			
			
		}
					
		}
		

	}
}
