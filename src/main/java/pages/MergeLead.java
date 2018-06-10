package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {

	public MergeLead() {
		
	}
	
	@FindBy(how=How.XPATH,using="//img[@alt='Lookup']")
	private WebElement fromlead;
	public  MergeLead clickfromlead()
	{
		click(fromlead);
		switchToWindow(1);
	    return this;
			
	}
	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement Name;
	public  MergeLead typefrom(String data)
	{
		type(Name, data);
	return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement findLeadsButton;
    public MergeLead clickLeadsButton()
    {
    	click(findLeadsButton);
    	return this;
    }
    
    @FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
    private WebElement firstFoundLeadMerge;
    public MergeLead clickfirstFoundLeadMerge()
    {
    	click(firstFoundLeadMerge);
    	switchToWindow(0);
    	return this;
    	
    }
    @FindBy(how=How.XPATH,using="//img[@alt='Lookup'])[2]")
	private WebElement tolead;
    public  MergeLead clickTolead()
	{
		click(tolead);
		switchToWindow(1);
	    return this;
			
	}
	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement Name2;
	public  MergeLead typeto(String data)
	{
		type(Name2, data);
	return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]]")
	private WebElement toLeadsButton;
    public MergeLead clickToLeadsButton()
    {
    	click(toLeadsButton);
    	return this;
    }
    
    @FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
    private WebElement firstFoundtoLeadMerge;
    public MergeLead clickfirstFoundToLeadMerge()
    {
    	click(firstFoundtoLeadMerge);
    	switchToWindow(0);
    	return this;
    	
    }
    
    @FindBy(how=How.LINK_TEXT,using="Merge")
    private WebElement MergeButton;
    public MergeLead MergeButtonClick()
    {
    	click(MergeButton);
    	acceptAlert();
    	return this;
    }
    
    @FindBy(how=How.LINK_TEXT,using="Find Leads")
    private WebElement FindLeads;
    public MergeLead FindLeadsClickMerge()
    {
    	click(FindLeads);
    	return this;
    }
    
}
