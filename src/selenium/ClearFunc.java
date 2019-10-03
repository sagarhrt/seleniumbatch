/* go to seleniumhq.org and type java and go back and clear java and type testing and enter*/
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearFunc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"q\"]"));
		ele.sendKeys("java");
		WebElement B = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		B.click();
		driver.navigate().back();
		ele.clear();
		ele.sendKeys("testing");

}
}