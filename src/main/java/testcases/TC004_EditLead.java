package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {

	@BeforeTest
	public void setData()
	{
		testCaseName="TC004_EditLead";
		testDescription="To Edit a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Arun";
		browserName="chrome";
		dataSheetName="TC004";
	}	
	@Test(dataProvider="fetchData")
	public void editLead(String uname,String password, String PhoneNumber, String Title)
	{
		new LoginPage()
        .enterUserName(uname)
        .enterPassword(password)
        .clickLogIn().clickCRMSFA().Leads().findLead()
        .FirstfoundNumbertype(PhoneNumber).findLeadsButtonClick()
        .FirstfoundLeadclick().EditLeadM().typeTitle(Title).clickUpdate();   
	}
	
}
	
