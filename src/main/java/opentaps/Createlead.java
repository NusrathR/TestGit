package opentaps;

import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sun.org.glassfish.gmbal.Description;

public class Createlead extends OpenTapsWrapper {
	@Test(dependsOnMethods={"opentaps.Sample5.s5","opentaps.Sample6.s6","opentaps.Sample7.s7","opentaps.Sample8.s8","opentaps.Sample9.s9","opentaps.Sample10.s10"},description ="This method is used for creating Lead",invocationCount=2,threadPoolSize=2)
  
  public void createLead() {
	  System.out.println("Lead Creation");
  }
  @AfterMethod(description ="This method is used for Lead Verification")
  public void verifyCreateLead()
  {
	  System.out.println("Verification of Create Lead");
  }
}
