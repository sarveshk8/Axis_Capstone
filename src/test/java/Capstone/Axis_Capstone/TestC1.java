package Capstone.Axis_Capstone;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PageObject.TestCase1;

public class TestC1 extends BaseConfiguration{
	
	public TestCase1 test1obj;
	
	
	WebDriver driver;
	
	@BeforeClass
    public void setupmethod() throws IOException{

        driver = getDriver();
        test1obj = new TestCase1(driver);
        
        
	}
	
	@Test
    public void Scenarios() throws IOException, InterruptedException{
        
		test1obj.TC1();
		
		
    }

}
