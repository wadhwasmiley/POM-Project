package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmznTestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public AmznTestBase() throws IOException{
		prop = new Properties();
		FileInputStream lp = new FileInputStream("C:\\Users\\mande\\Desktop\\Smiley\\QA Automation\\Selenium_Workspace\\AmazonTest\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties");
		prop.load(lp);
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\mande\\Desktop\\Smiley\\QA Automation\\SeleniumJars\\geckodriver.exe");
			   driver = new FirefoxDriver(); 
		}else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mande\\Desktop\\Smiley\\QA Automation\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("url"));
	}
	

}
