package gridexecution;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstone.Axis_Capstone.BaseConfigGrid;
import PageObject.TestCase1;


public class Testgrid1 extends BaseConfigGrid{
	
	TestCase1 test1obj;
	
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		test1obj = new TestCase1(driver);


}
	@Test
	public void test1() throws IOException, InterruptedException {
		
		test1obj.TC1();

		
	}
	
	
	
	
	
}
