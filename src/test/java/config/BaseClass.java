package config;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	//public String browserType;
	
//	public BaseClass(String browserType)
//	{
//		this.browserType=browserType.toLowerCase();
//	}
	
	public WebDriver getDriver(String browserType)
	{
		switch(browserType)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions coption=new ChromeOptions();
			coption.setCapability("webSocketUrl", true);
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fOption=new FirefoxOptions();
			fOption.setCapability("webSocketUrl", true);
			driver=new FirefoxDriver();
			break;
			
		case "chrome-rc":
			WebDriverManager.chromedriver().setup();
			ChromeOptions cOptions=new ChromeOptions();

			try {
				driver=new RemoteWebDriver(new URL("http://localhost:4444/"), cOptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "firefox-rc":
			WebDriverManager.chromedriver().setup();
			FirefoxOptions fOption2=new FirefoxOptions();

			try {
				driver=new RemoteWebDriver(new URL("http://localhost:4444/"), fOption2);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "aws-rc-firefox":
			WebDriverManager.chromedriver().setup();
			FirefoxOptions fOption3=new FirefoxOptions();

			try {
				driver=new RemoteWebDriver(new URL("http://13.127.86.130:4444/"), fOption3);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	

}
