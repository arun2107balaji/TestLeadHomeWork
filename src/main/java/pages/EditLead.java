package pages;

import javax.sound.sampled.EnumControl.Type;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_generalProfTitle")
	private WebElement Title;
	public EditLead typeTitle(String data)
	{
		type(Title,data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="submitButton")
	private WebElement submitButton;
	public ViewLead clickUpdate()
	{
		click(submitButton);
		return new ViewLead();
	}
}
