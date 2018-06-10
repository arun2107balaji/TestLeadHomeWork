package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement CompanyName;
	public CreateLead CompanyNametype(String data) {
	    type(CompanyName, data);
		return this;
}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
    private WebElement FirstName;
    public CreateLead FirstNameType(String data)
    {
		type(FirstName,data);
		return this;
    }
    
    @FindBy(how=How.ID,using="createLeadForm_lastName")
    private WebElement LastName;
    public CreateLead LastNameType(String Data)
    {
    	type(LastName,Data);
    	return this;
    }
    
    @FindBy(how=How.CLASS_NAME,using="smallSubmit")
    private WebElement submit;
    public ViewLead clicksubmit()
    {
    	click(submit);
    	return new ViewLead();
    }
    
    
}