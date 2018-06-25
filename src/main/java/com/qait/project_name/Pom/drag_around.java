package com.qait.project_name.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class drag_around {
WebDriver driver;
drag_around d;
drag_around(WebDriver driver)
{
	this.driver=driver;
}
public WebElement value_dragbox()
{
	return this.driver.findElement(By.cssSelector("#dragbox"));
}
public WebElement value_dropbox()
{
	return this.driver.findElement(By.cssSelector("#dropbox"));
}
public void proceed()
{
	Actions act=new Actions(driver);
	act.dragAndDrop(d.value_dragbox(), d.value_dropbox()).build().perform();
	String expected_url="http://10.0.1.86/tatoc/basic/windows";
	Assert.assertEquals(expected_url, driver.getCurrentUrl());
}
}