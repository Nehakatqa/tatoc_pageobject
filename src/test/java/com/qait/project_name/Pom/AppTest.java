package com.qait.project_name.Pom;


//package com.qait.automation;
//import com.qait.project_name.Pom.*;

import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
		WebDriver driver;
		basic_grid b;
		launch_url lu;
		Frame_Dungeon f;
		drag_around d;
		Popup_windows pw;
		cookie_handling c;
		@BeforeClass
		public void run()
		{
			driver=new ChromeDriver();
			lu=new launch_url(driver);
			b=new basic_grid(driver);
			f=new Frame_Dungeon(driver);
			d=new drag_around(driver);
			c=new cookie_handling(driver);
		}	
			
		
		@Test
		public void Step01web_browser_launches()
		{
			lu.url();
		}
		@Test
		public void Step02click_on_basiccourse()
		{
			lu.click_on_basiccourse();
		}
		@Test
		public void Step04clickredbox()
		{
		b.click_on_redbox();
		}
		
		@Test
		public void Step03clickgreenbox()
		{
			b.click_on_greenbox();
		}
		
		@Test
		public void Step05frame2()
		{
			f.proceed_dragaround();
		}
		@Test
		public void Step06dragaround()
		{
			d.proceed();
		}
		
		@Test
		public void Step07launchpopup()
		{
			pw.proceed();
		}
	
		public void Step0cookie_end()
		{
			c.proceed_end();
		}
		
	
   
}

