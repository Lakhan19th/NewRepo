package com.qa.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test{
	public static void main(String args[]){
	
	    /*WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");*/
	System.setProperty("webdriver.gecko.driver", "F://Automation Training//Jar Files//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	
		//System.out.println(System.getProperty("os.name"));
		
		
		/*System.setProperty("webdriver.chrome.driver", "E://Automation Training//Jar Files//Jar Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");*/	
	}
	
}
