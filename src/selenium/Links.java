/* popup removal by giving user name and password through link*/
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	WebElement el= driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"));
	System.out.println(el.getText());/*to get web text on the consol*/
	driver.close();
}
}
