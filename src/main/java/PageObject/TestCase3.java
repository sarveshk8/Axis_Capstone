package PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestCase3 {
	
	WebDriver driver;
    public TestCase3(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement Signup;
    
    @FindBy(xpath = "(//input[@name='email'])[1]")
    WebElement email;
    
    @FindBy(xpath = "//input[@name='password']")
    WebElement pass;
    
    @FindBy(xpath = "//a[text()=' Home']")
    WebElement Homepage;
    
    @FindBy(xpath = "//h2[text()='Login to your account']")
    WebElement text;
    
    @FindBy(xpath = "//button[text()='Login']")
    WebElement login;
    
    public void TC3() throws IOException {
    
    	
    	FileInputStream fis = new FileInputStream("C:\\Users\\Sarvesh\\eclipse-workspace\\Axis_Capstone\\src\\main\\java\\Config\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String emailadd = prop.getProperty("email");
		String pass1 = prop.getProperty("pass1");
    	Assert.assertTrue(Homepage.isDisplayed());
    	Signup.click();
    	Assert.assertTrue(text.isDisplayed());
    	email.sendKeys(emailadd);
    	pass.sendKeys(pass1);
    	login.click();
    	
    }
    
}
