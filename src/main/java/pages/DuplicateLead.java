/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.ProjectMethods;

/**
 * @author admin
 *
 */
public class DuplicateLead extends ProjectMethods{

	/**
	 * 
	 */
	public DuplicateLead() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement duplead;
	public ViewLead duplicateLeadClick()
	{
		click(duplead);
		return new ViewLead();
	}
	
	{
		
	}
	
}
