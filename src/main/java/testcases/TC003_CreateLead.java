package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {

	
		@BeforeTest
		public void setData()
		{
			testCaseName="TC002_LoginforNegative";
			testDescription="Login for failure(Negative)";
			testNodes="Leads";
			category="Smoke";
			authors="Arun";
			browserName="chrome";
			dataSheetName="TC_003";
		}	
		
		@Test(dataProvider="fetchData")
		public void CreateLeadmethod(String uname,String password,String CompanyName,String FirstName,String LastName,String Firstnameverify)
		{
			new LoginPage()
		        .enterUserName(uname)
		        .enterPassword(password)
	            .clickLogIn().clickCRMSFA().Leads().MyLeads1()
			    .CompanyNametype(CompanyName).FirstNameType(FirstName).LastNameType(LastName).clicksubmit().firstnameverify(Firstnameverify);	    
			                    
		}
		
		}
	
	


