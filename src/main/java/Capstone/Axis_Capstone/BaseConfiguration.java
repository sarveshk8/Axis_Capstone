package Capstone.Axis_Capstone;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseConfiguration {
	
WebDriver driver;
	
	public WebDriver getDriver() throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sarvesh\\eclipse-workspace\\Axis_Capstone\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
		return driver;
		
	}


}
