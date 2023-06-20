package gridexecution;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Capstone.Axis_Capstone.BaseConfigGrid;
import PageObject.TestCase5;

public class Testgrid5 extends BaseConfigGrid{
	
TestCase5 test5obj;
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeClass
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);

		test5obj = new TestCase5(driver);
}
	
	@Test
	
public void test5() throws IOException, InterruptedException {
		
		test5obj.TC5();

	}

}
