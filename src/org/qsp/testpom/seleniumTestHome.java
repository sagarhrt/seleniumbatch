package org.qsp.testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.seleniumHome;

public class seleniumTestHome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumhq.org");
	seleniumHome sh = new seleniumHome(driver);
	sh.sendText("java");
	sh.goClick();
	driver.navigate().back();
	sh.searchclr();
	sh.sendText("testng");
	sh.goClick();
	
}
}
