package PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestCase2 {
	
	WebDriver driver;
    public TestCase2(WebDriver driver){
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
    
    @FindBy(xpath = "//a[text()=' Logged in as ']")
    WebElement visibletext;
    
    @FindBy(xpath = "//a[text()=' Logout']")
    WebElement logout;
    
    
  public void TC2() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\Users\\Sarvesh\\eclipse-workspace\\Axis_Capstone\\src\\main\\java\\Config\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
	  
	  Assert.assertTrue(Homepage.isDisplayed());
	  Signup.click();
	  Assert.assertTrue(text.isDisplayed());
	  
	  String emailid = prop.getProperty("emailid");
	  String passwd = prop.getProperty("passwd");
	  email.sendKeys(emailid);
	  pass.sendKeys(passwd);
	  login.click();
	  Assert.assertTrue(visibletext.isDisplayed());
	  logout.click();
	  Assert.assertTrue(Signup.isDisplayed());
	  
	  
	  
	  
	  
  }
    
  
    
    
  
  
    
    
    

}
