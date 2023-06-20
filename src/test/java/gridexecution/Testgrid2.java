package gridexecution;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Capstone.Axis_Capstone.BaseConfigGrid;
import PageObject.TestCase2;


public class Testgrid2 extends BaseConfigGrid{
	
	
	TestCase2 test2obj;
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeClass
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);

		test2obj = new TestCase2(driver);


}
	
	@Test
	
public void test2() throws IOException, InterruptedException {
		

		test2obj.TC2();

	
	}

}
