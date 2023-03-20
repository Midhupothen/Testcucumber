package com.base;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Baseclass {

		public WebDriver driver;
		
		
		public WebDriver initializeDriver()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			return driver;
		}
		
		public void closeDriver()
		{
			driver.close();
			
		}
		public void closeAllDriver()
		{
			driver.quit();
		}

	}


