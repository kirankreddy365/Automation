package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.BaseClass;

public class Test1 {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browserType")
	public void su(String browserType)
	{
		BaseClass bs=new BaseClass();
		driver=bs.getDriver(browserType);
	}
	
	@Test
	public void m1()
	{
		System.out.println("I am method one.");
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void m2()
	{
		System.out.println("I am method two.");
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void m3()
	{
		System.out.println("I am method three.");
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
