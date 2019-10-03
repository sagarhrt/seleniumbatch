package selenium;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng7 {
	@DataProvider
	public String[][] dataRead() {
		String[][] st = new String[3][2];
		st[0][0]="userA";
		st[0][1]="A";
		st[1][0]="userB";
		st[1][1]="B";
		st[2][0]="userC";
		st[2][1]="C";
		return st;
	}
	@Test(dataProvider="dataRead")
	public void demo(String un,String pw) {
		Reporter.log(un+""+pw,true);
	}
	}


