package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng6 {
@Test
public void deo()
{
	int i=5;
	int j=5;
	Assert.assertEquals(i, j);//assert is a class assertEquals is static method using this we can compare two values
	System.out.println("validate");
	SoftAssert sa = new SoftAssert();//Softassert is class which allow to execute all lines after exception
	sa.assertEquals(9, 19);
	System.out.println("hi");
	sa.assertAll();
	
}
}
