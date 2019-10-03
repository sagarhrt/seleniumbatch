package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();//for x-axis u hv to comment this maximize
		driver.get("http://www.seleniumhq.org/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
	/*	
		//for y-axis for percticular index
				js.executeScript("window.scrollBy(0,500)");
		
		//for x-axis for percticular index
		js.executeScript("window.scrollBy(500,0)");
		
		/*
		//to move directly scroll down at end
		window.scrollTo(0,document.body.scrollHeight);
		*/
		
		
		/*
		//to move directly scroll right 
		window.scrollTo(document.body.scrollWidth,0);
		*/
		
		
		
		/* move to perticular element and go back to top*/
		WebElement ele = driver.findElement(By.xpath("//h2[contains(.,'Selenium Sponsors')]"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
		
		

	}
}
