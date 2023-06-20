package Capstone.Axis_Capstone;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.TestCase5;

public class TestC5 extends BaseConfiguration{
	
public TestCase5 test5obj;
	
	WebDriver driver;
	
	@BeforeClass
    public void setupmethod() throws IOException{

        driver = getDriver();
        test5obj = new TestCase5(driver);
        
	}
	
	@Test
    public void Scenarios() throws IOException, InterruptedException{
        
		test5obj.TC5();
		
    }

}
