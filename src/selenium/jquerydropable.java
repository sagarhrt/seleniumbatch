package selenium;
//drag box into another
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquerydropable {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryui.com/droppable");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		WebElement s = driver.findElement(By.id("draggable"));
		WebElement t = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(s,t).perform();
		Thread.sleep(10000);
	}
}
