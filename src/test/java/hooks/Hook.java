package hooks;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods {

	@Before
	public void beforeScenario(Scenario sc)
	{
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		
		test = startTestCase(sc.getId());
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp("chrome");		
	}
	
	@After
	public void afterScenario()
	{
		closeAllBrowsers();
		endResult();
		
	}
		
	}
	
	

