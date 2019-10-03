package selenium;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnrDemo.class)
public class DemolistnerClass {
	@Test
	public void test1() {
		System.out.println("Sagar");
		
	}
@Test
public void test2() {
	System.out.println("Sagar");
	Assert.fail();
}
}
