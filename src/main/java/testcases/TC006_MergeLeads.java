package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLeads extends ProjectMethods {

	@BeforeTest
	public void setData()
	{
		testCaseName="TC006_MergeLead";
		testDescription="To Merge a couple of Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Arun";
		browserName="chrome";
		dataSheetName="TC006";
	}	
	@Test(dataProvider="fetchData")
	public void MergeLead(String uname,String password, String FromLead, String toLead)
	{
		new LoginPage()
        .enterUserName(uname)
        .enterPassword(password)
        .clickLogIn().clickCRMSFA().Leads().mergeLeadsClick().clickfromlead().
        typefrom(FromLead).
        clickLeadsButton().clickfirstFoundLeadMerge().clickTolead().
        typeto(toLead).clickToLeadsButton().clickfirstFoundToLeadMerge().
        MergeButtonClick().FindLeadsClickMerge();
	}
	
}
	
