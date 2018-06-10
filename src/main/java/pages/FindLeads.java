package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public FindLeads() {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement ele;
	public FindLeads findLeadstype(String data)
	{
		type(ele, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
    private WebElement findLeadsButton;
	public FindLeads findLeadsButtonClick()
	{
		click(findLeadsButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")
	private WebElement FirstfoundLead;
	public  ViewLead FirstfoundLeadclick()
	{
		click(FirstfoundLead);
		return new ViewLead();
	}
	
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement FirstFoundNumber;
	public  FindLeads FirstfoundNumbertype(String data)
	{
		type(FirstFoundNumber, data);
		return this;
	}
}

   