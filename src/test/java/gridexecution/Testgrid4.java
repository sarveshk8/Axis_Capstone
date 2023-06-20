package gridexecution;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Capstone.Axis_Capstone.BaseConfigGrid;
import PageObject.TestCase4;

public class Testgrid4 extends BaseConfigGrid{
	
TestCase4 test4obj;
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeClass
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);

		test4obj = new TestCase4(driver);
}
	
	@Test
	
public void test4() throws IOException, InterruptedException {
		
		test4obj.TC4();

	}


}
