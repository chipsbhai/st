package Pack05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Prog02 {
	@Test(dataProvider = "myData")
	public void login(String username, String password) {
		System.out.println("Login Credentials");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	@DataProvider(name = "myData")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "USER ONE";
		data[0][1] = "VIT1@";
		data[1][0] = "USER TWO";
		data[1][1] = "VIT12#";
		data[2][0] = "USER THREE";
		data[2][1] = "VIT123#$";

		return data;
	}
}