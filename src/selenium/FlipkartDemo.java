/*flipkart select elecronics mobile in that mi click on first mobile it must open in new tab then add it to kart*/
package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement popup = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		popup.click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		/*@SuppressWarnings("unused")
		WebElement mi= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a"));
		mi.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String tab :tabs) {
			Thread.sleep(1000);
			WebElement e2= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div"));
			e2.click();
		
			
		}
		WebElement cart= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		cart.click();
		*/
	}
		
		
}
