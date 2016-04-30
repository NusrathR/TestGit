package sundaycw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateLead extends OpenTapsWrapper{
  
	@DataProvider(name="Count")
	  public Object[][] MultipleData(){
		Object[][] data = new Object[2][5];
		data[0][0]="Username1";
		data[0][1]="Comsddkscn1";
		data[0][2]="Company1";
		data[0][3]="Firstname1";
		data[0][4]="Lastname1";
		data[1][0]="Username2";
		data[1][1]="Password2";
		data[1][2]="Company2";
		data[1][3]="Firstname2";
		data[1][4]="Lastname2";
		return data;
	  }
	@Test(dataProvider="Count",groups ="Smoke")
    public void doCreateLead(String username,String as,String company,String FirstName,String ln)
    {
		System.out.println("Create Lead");		
		System.out.println("username::"+username+"password::"+as+"company::"+company+"FirstName::"+FirstName+"Last Name::"+ln);	
    }
	@AfterMethod(groups="Smoke")
  public void VerifyCreateLead() {
	  System.out.println("Verify Create Lead");
  }
 
}
