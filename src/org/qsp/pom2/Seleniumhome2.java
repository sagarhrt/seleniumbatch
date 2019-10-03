package org.qsp.pom2;

/*FLIPKART CLICKING ELECRONICS AND MI MOBILE USING POM METHODS */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seleniumhome2 {
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span")
	private WebElement Electonics;
	@FindBy(xpath="//input[@id=\"submit\"]")
	private WebElement go;
	

	
	public Seleniumhome2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendText() {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void goClick()
	{
		go.click();
	}
	
	public void searchclr()
	{
		search.clear();
	}

}
