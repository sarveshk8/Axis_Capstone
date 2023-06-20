package Capstone.Axis_Capstone;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PageObject.TestCase6;

public class TestC6 extends BaseConfiguration{
	
public TestCase6 test6obj;
	
	WebDriver driver;
	
	@BeforeClass
    public void setupmethod() throws IOException{

        driver = getDriver();
        test6obj = new TestCase6(driver);
        
	}
	
	@Test
    public void Scenarios() throws IOException, InterruptedException{
        
		test6obj.TC6();
		
    }

}
