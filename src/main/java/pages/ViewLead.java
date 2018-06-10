package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ViewLead extends CreateLead {

	public ViewLead() {
		
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement firstnameview;
	public ViewLead firstnameverify(String Data)
	{
		verifyExactText(firstnameview, Data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement editLeadButton;
	public EditLead EditLeadM()
	{
		click(editLeadButton);
		return new EditLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement DuplicateLeadButton;
	public DuplicateLead DupLeadbuttonclick()
	{
		click(DuplicateLeadButton);
		return new DuplicateLead();
	}
	}
	

