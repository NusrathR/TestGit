package sundaycw;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenTapsWrapper {
	@Parameters("browser") 
	
	@BeforeClass(groups={"Smoke","Sanity"})
	public void LaunchBrowser(String brows){
		System.out.println("Launched the browser::"+brows);
	}
	@AfterClass(alwaysRun=true,groups={"Smoke","Sanity"})
	public void CloseBrowser(){
		System.out.println("Close the browser");
	}
	@BeforeMethod(groups={"Smoke","Sanity"})
	public void LoginCrmLeadTab()
	{
		System.out.println("Login + Click CRM + Click Lead Tab");
	}
}
