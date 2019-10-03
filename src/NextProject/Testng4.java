package NextProject;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng4 {
	@BeforeMethod
	public void BM()
	{
		Reporter.log("BM",true);
	}
	
	
	@Test(groups="smoke")//we can group the test cases by giving name like this
	public void TestDemo1()
	{
		Reporter.log("Rakshit",true);
	}
	@Test(groups="smoke")
	public void TestDemo2()
	{
		Reporter.log("Sagar",true);
	}
	@Test(groups="FT", dependsOnGroups="smoke")//here we execute smoke test cases grp before this group
	public void TestDemo3()
	{
		Reporter.log("Sinu",true);
	}
	@Test(groups="smoke")
	public void TestDemo4()
	{
		Reporter.log("Suhas",true);
	}
	
	@Test(groups="smoke", enabled=false)//here we can also skip execution of this method using enable=false
	public void TestDemo5()
	{
		Reporter.log("Manja",true);
	}
	
	
	
	@AfterMethod
	public void AM()
	{
		Reporter.log("AM",true);
	}

}
