package selenium;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook123 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Day");
		String d = sc.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		
		
	}

}
