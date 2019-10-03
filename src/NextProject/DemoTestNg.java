//testing case runing through testng
package NextProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNg {
	WebDriver driver;
	
@BeforeMethod
public void  preset() {
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Reporter.log("BM"+true);
}

 @AfterMethod
 public void closeD(){
	driver.close();
	Reporter.log("AM"+true);
}
@Test
public void demo1() throws InterruptedException {
	
	driver.findElement(By.id("email")).sendKeys("alia");
	driver.findElement(By.id("pass")).sendKeys("ranbir");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	Reporter.log("D1"+true);
	
	
}

@Test
public void demo2() throws InterruptedException {
	
	driver.findElement(By.id("email")).sendKeys("deepika");
	driver.findElement(By.id("pass")).sendKeys("ranbir");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	Reporter.log("D2"+true);
	
}

@Test
public void demo3() throws InterruptedException {
	
	driver.findElement(By.id("email")).sendKeys("alia");
	driver.findElement(By.id("pass")).sendKeys("ranveer");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	Reporter.log("D3"+true);
	
}


}
