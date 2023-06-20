package Capstone.Axis_Capstone;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.TestCase2;


public class TestC2 extends BaseConfiguration{
	
public TestCase2 test2obj;
	
	WebDriver driver;
	
	@BeforeClass
    public void setupmethod() throws IOException{

        driver = getDriver();
        test2obj = new TestCase2(driver);
        
	}
	
	@Test
    public void Scenarios() throws IOException, InterruptedException{
        
		test2obj.TC2();
		
    }

}
