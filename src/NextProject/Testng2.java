package NextProject;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng2 {

	@BeforeMethod
	public void BM()
	{
		Reporter.log("BM",true);
	}
	@Test(priority=2,invocationCount=5)//we can set priority like this this wil execute aftr Testdemo1
	public void TestDemo()
	{
		Reporter.log("TD",true);
	}
	@Test(priority=1)//to run more than once i am running 5 times
	public void TestDemo1()
	{
		Reporter.log("Sagar",true);
	}
	@AfterMethod
	public void AM()
	{
		Reporter.log("AM",true);
	}
	

}
