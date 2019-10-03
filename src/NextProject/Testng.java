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

public class Testng {
	@BeforeSuite
	public void Bs()
	{
		Reporter.log("BS",true);
	}
	@BeforeTest
	public void BT()
	{
		Reporter.log("BT",true);
	}
	@BeforeClass
	public void BC()
	{
		Reporter.log("BC",true);
	}
	@BeforeMethod
	public void BM()
	{
		Reporter.log("BM",true);
	}
	@Test
	public void TestDemo()
	{
		Reporter.log("TD",true);
	}
	@AfterMethod
	public void AM()
	{
		Reporter.log("AM",true);
	}
	@AfterClass
	public void AC()
	{
		Reporter.log("AC",true);
	}
	@AfterTest
	public void AT()
	{
		Reporter.log("AT",true);
	}
	@AfterSuite
	public void AS()
	{
		Reporter.log("AS",true);
	}
}
