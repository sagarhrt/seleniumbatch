package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleniumHome {
	@FindBy(id="q")
	private WebElement search;
	@FindBy(xpath="//input[@id=\"submit\"]")
	private WebElement go;
	
	public seleniumHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendText(String text) {
		search.sendKeys(text);
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
