package gridexecution;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Capstone.Axis_Capstone.BaseConfigGrid;
import PageObject.TestCase6;

public class Testgrid6 extends BaseConfigGrid{
	
TestCase6 test6obj;
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeClass
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);

		test6obj = new TestCase6(driver);
}
	
	@Test
	
public void test6() throws IOException, InterruptedException {
		
		test6obj.TC6();

	}

}
