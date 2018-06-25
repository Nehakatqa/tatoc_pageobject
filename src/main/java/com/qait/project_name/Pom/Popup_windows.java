package com.qait.project_name.Pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Popup_windows {
	WebDriver driver;
	Popup_windows(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String get_MainWindow()
	{
		String MainWindow=driver.getWindowHandle();	
		return MainWindow;
	}
	public void launch_popup()
	{
		Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();	
            if(get_MainWindow().equalsIgnoreCase(ChildWindow))
            {
            	driver.switchTo().window(ChildWindow);
            }
        }
        String expected_url="http://10.0.1.86/tatoc/basic/windows/popup";
        Assert.assertEquals(expected_url, driver.getCurrentUrl());
	}
        public void set_value()
        {
        	 this.driver.findElement(By.id("name")).sendKeys("Neha");
        }
        public void submit_button()  
        {
        	this.driver.findElement(By.id("submit")).click();
        	String expected_url="http://10.0.1.86/tatoc/basic/windows#";
        	Assert.assertEquals(expected_url, this.driver.getCurrentUrl());
        	//Thread.sleep(1000);
        }
	public void launch_popup_window()
	{
		 	get_MainWindow();
		 	launch_popup();
		 	set_value();
		 	submit_button();
	        driver.switchTo().window(get_MainWindow());
	          
	}
	public void proceed()
	{
		
		launch_popup_window();
		driver.findElement(By.linkText("Proceed"));
		String expected_url="http://10.0.1.86/tatoc/basic/windows";
		Assert.assertEquals(expected_url, driver.getCurrentUrl());
	}

		
	}

