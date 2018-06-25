package com.qait.project_name.Pom;

import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
	App(WebDriver driver)
	{
		this.driver=driver;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
    }
}
