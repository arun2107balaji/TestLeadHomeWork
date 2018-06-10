package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	ChromeDriver driver;
	
	@Given("Invoke the Application")
	public void InvokeApp()
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//launches the browser	
	driver = new ChromeDriver();
	driver.manage().window().maximize();//maximize the window
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://leaftaps.com/opentaps/");
	}
	
	@And("Enter the UserName as (.*)")
    public void enterUserName(String uname)
    {
		  driver.findElementById("username").sendKeys(uname);
    }
	
	@And("Enter the Password as (.*)")
	public void enterPassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}
	
	@When("Click Login")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		}
	@Then("Verify Login")
	public void VerifyLogin()
	{
		System.out.println("Login Successful");
	}
	
	@And("Click CRM/SFA")
	public void ClickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	
   
    @And("Click on the CreateLead")
    public void CreateLeadClick()
    {
    	driver.findElementByLinkText("Create Lead").click();;
    }
    
    @And("Enter CompanyName as (.*)")
    public void EnterCompanyName(String CompanyName)
    {
    	driver.findElementById("createLeadForm_companyName").sendKeys(CompanyName);
    }
    
    @And("Enter FirstName as (.*)")
    public void EnterFirstName(String FirstName)
    {
    	driver.findElementById("createLeadForm_firstName").sendKeys(FirstName);
    }
    
    @And("Enter LastName as (.*)")
    public void EnterLastName(String LastName)
    {
    	driver.findElementById("createLeadForm_lastName").sendKeys(LastName);
    }
    
    @And("Click CreateLeadButton")
    public void ClickCreateLeadButton()
    {
    	driver.findElementByClassName("smallSubmit").click();
    }
    
    
    
    @And("Verify CreateLeads")
    public void VerifyCreateLead()
    {
    	System.out.println("Create Lead Successfull");
    }}
	

