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
			
		}	
			
		
		@Test
		public void Step01web_browser_launches()
		{
			lu.url();
		}
		@Test(dependsOnMethods={"Step01web_browser_launches"})
		public void Step02click_on_basiccourse()
		{
			lu.click_on_basiccourse();
		}
		@Test(dependsOnMethods={"Step02click_on_basiccourse"})
		public void Step04clickredbox()
		{
		b.click_on_redbox();
		}
		
		@Test(dependsOnMethods={"Step04clickredbox"})
		public void Step03clickgreenbox()
		{
			b.click_on_greenbox();
		}
		
		@Test(dependsOnMethods={"Step03clickgreenbox"})
		public void Step05frame2()
		{
			
			f=new Frame_Dungeon(driver);
			f.proceed_dragaround();
			
		}
		@Test(dependsOnMethods={"Step05frame2"})
		public void Step06dragaround()
		{
			d=new drag_around(driver);
			d.proceed();
		}
		
		@Test(dependsOnMethods={"Step06dragaround"})
		public void Step07launchpopup()
		{
			c=new cookie_handling(driver);
			pw.proceed();
		}
		@Test(dependsOnMethods={"Step07launchpopup"})
		public void Step0cookie_end()
		{
			c.proceed_end();
		}
		
	
   
}

