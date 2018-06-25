package com.qait.project_name.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Frame_Dungeon {
	WebDriver driver;
	String box2=this.driver.findElement(By.cssSelector("body > center > a:nth-child(7)")).getText();
	String box1=value_of_box1();
	By link2=By.cssSelector("body > center > a:nth-child(9)");
	Frame_Dungeon(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String value_of_box1()
	{
		return this.driver.findElement(By.cssSelector("#answer")).getText();
	
	}
	
	public void repaint()
	{
		//WebElement repaint_link=driver.findElement(By.cssSelector("body > center > a:nth-child(7)"));
		//Assert.assertTrue(repaint_link.isDisplayed());
		while(true)
		{
			driver.switchTo().frame("child");
			String box2=this.driver.findElement(By.cssSelector("body > center > a:nth-child(7)")).getText();
			String box1=value_of_box1();
			driver.switchTo().parentFrame();
			if(!box1.equals(box2))
				driver.findElement(By.linkText("Repaint Box 2")).click();
			
			
		}
		
		
	}
	public void proceed_dragaround()
	{
		
		repaint();
		driver.findElement(By.linkText("Proceed")).click();
		String clickonproceed="http://10.0.1.86/tatoc/basic/drag";
		Assert.assertEquals(clickonproceed, driver.getCurrentUrl());
	}

}
