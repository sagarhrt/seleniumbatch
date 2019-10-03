package NextProject;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng3 {
	@BeforeMethod
	public void BM()
	{
		Reporter.log("BM",true);
	}
	@Test()
	public void TestDemo1()
	{
		Reporter.log("Rakshit",true);
	}
	@Test(dependsOnMethods= {"TestDemo3","TestDemo1"})
	public void TestDemo2()
	{
		Reporter.log("Sagar",true);
	}
	@Test()
	public void TestDemo3()
	{
		Reporter.log("Sinu",true);
	}
	@AfterMethod
	public void AM()
	{
		Reporter.log("AM",true);
	}

}
