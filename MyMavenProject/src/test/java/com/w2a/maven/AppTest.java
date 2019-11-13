package com.w2a.maven;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	
	public void testGoogle(){
		
		//System.setProperty("webdriver.gecko.driver", "D:\\MyLearning\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
	}


}
