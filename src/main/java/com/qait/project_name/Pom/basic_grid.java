package com.qait.project_name.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class basic_grid  {
	WebDriver driver;
	basic_grid(WebDriver driver)
	{
		this.driver=driver;
	}
	By box1=By.className("greenbox");
	By box2=By.className("redbox");
	public WebElement getErrorMessageElement()
	{
		return this.driver.findElement(By.cssSelector("body > div > div.page > span"));
	}
	public void click_on_greenbox()
	{
		driver.findElement(box1).click();

		String expected_url="http://10.0.1.86/tatoc/basic/frame/dungeon";
		Assert.assertEquals(expected_url,driver.getCurrentUrl());
		
		
	}
	public String click_on_redbox()
	{
		driver.findElement(box2).click();
		Assert.assertEquals(click_on_redbox(), "The page you are looking for does not exist");
		return getErrorMessageElement().getText();
		
	}

}
