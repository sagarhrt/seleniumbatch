package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TwoBrowser {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	@Test
	public void testParameterWithXML() {
		driver.get("http://demo.guru99.com");
	}
}
