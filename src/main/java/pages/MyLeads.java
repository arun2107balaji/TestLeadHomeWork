package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {

	public MyLeads()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement CreateLink;
	public CreateLead MyLeads1() {
	    click(CreateLink);
		return new CreateLead();	
}
	@FindBy(how=How.XPATH,using="((//a[@class='linktext'])[4]")
	private WebElement clickLead1;
	public ViewLead clicklead()
	{
		click(clickLead1);
		return new ViewLead();
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement FindLeadbutton;
	public FindLeads findLead()
	{
		click(FindLeadbutton);
		return new FindLeads();
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement MergeLeadsbutton;
	public MergeLead mergeLeadsClick()
	{
		click(MergeLeadsbutton);
		return new MergeLead();
	}
}
