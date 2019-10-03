package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement el= driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		el.click();
		Runtime r=Runtime.getRuntime();
		r.exec("C:\\Users\\123456\\Desktop\\upload.exe");
		

		
	}

}
