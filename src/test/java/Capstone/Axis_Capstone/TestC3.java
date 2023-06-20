package Capstone.Axis_Capstone;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.TestCase3;


public class TestC3 extends BaseConfiguration{
	
public TestCase3 test3obj;
	
	WebDriver driver;
	
	@BeforeClass
    public void setupmethod() throws IOException{

        driver = getDriver();
        test3obj = new TestCase3(driver);
        
	}
	
	@Test
    public void Scenarios() throws IOException, InterruptedException{
        
		test3obj.TC3();
		
    }

}
