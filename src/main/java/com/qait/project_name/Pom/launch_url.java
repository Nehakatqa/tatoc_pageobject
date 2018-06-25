package com.qait.project_name.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class launch_url {

	WebDriver driver;
	launch_url(WebDriver driver)
	{
		this.driver=driver;
	}
	public void url()
	{
		driver.get("http://10.0.1.86/tatoc");
		WebElement logo = driver.findElement(By.className("title"));
		Assert.assertTrue(logo.isDisplayed());
	}
	public void click_on_basiccourse()
	{
		WebElement link=driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(4)"));
		Assert.assertTrue(link.isDisplayed());
		link.click();
		//String expected_url="\"http://10.0.1.86/tatoc/basic";
		//Assert.assertEquals(expected_url, driver.getCurrentUrl());
	}
}
