package selenium;

import org.testng.annotations.Test;

public class TestData {
	@Test(dataProviderClass = ReadElDataProviderTestng.class, dataProvider = "CreateUser")
	public void test(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}

}
