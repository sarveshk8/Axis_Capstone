package gridexecution;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Capstone.Axis_Capstone.BaseConfigGrid;
import PageObject.TestCase3;

public class Testgrid3 extends BaseConfigGrid{
	
TestCase3 test3obj;
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeClass
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);

		test3obj = new TestCase3(driver);
}
	
	@Test
	
public void test3() throws IOException, InterruptedException {
		
		test3obj.TC3();

	}

}
