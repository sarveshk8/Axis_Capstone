package Capstone.Axis_Capstone;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PageObject.TestCase4;

public class TestC4 extends BaseConfiguration{
	
public TestCase4 test4obj;
	
	WebDriver driver;
	
	@BeforeClass
    public void setupmethod() throws IOException{

        driver = getDriver();
        test4obj = new TestCase4(driver);
        
	}
	
	@Test
    public void Scenarios() throws IOException, InterruptedException{
        
		test4obj.TC4();
		
    }

}
