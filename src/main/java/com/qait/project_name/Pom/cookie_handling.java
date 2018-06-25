package com.qait.project_name.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class cookie_handling {
WebDriver driver;
cookie_handling(WebDriver driver)
{
	this.driver=driver;
}
public String generate_token()
{
	return this.driver.findElement(By.id("token")).getText();
}
public void create_cookies()
{
	   String [] splt=generate_token().split("\\s");
	   Cookie name = new Cookie("Token", splt[1]);
	   driver.manage().addCookie(name);
}
public void proceed_end()
{
	create_cookies();
	driver.findElement(By.linkText("Proceed")).click();
	String expected_url="http://10.0.1.86/tatoc/basic/end";
	Assert.assertEquals(expected_url, driver.getCurrentUrl());
}

}
