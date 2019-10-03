package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sagar {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
			WebElement ele = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[6]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
			@SuppressWarnings("unused")
			WebElement el= driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[6]/div/ul/li[2]/div[1]/ul/li[3]/span"));
			el.click();
			WebElement e2= driver.findElement(By.xpath("//*[@id=\"pid_5675\"]/img"));
			e2.click();
			WebElement el3 = driver.findElement(By.xpath("//*[@id=\"attributes\"]/span/div/span"));
			el3.click();
			WebElement el4 = driver.findElement(By.xpath("//*[@id=\"sizeList\"]/div[3]/ul/li[1]/span[2]"));
			el4.click();
			WebElement el5 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/div/div[1]/div[1]"));
			el5.click();

			


		}
			
			
	}

	

