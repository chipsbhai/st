package Pack05;

import org.testng.annotations.Test;

public class Prog03 {
	@Test(dataProvider = "myData", dataProviderClass = Prog02.class)
	public void login(String username, String password) {
		System.out.println("Login Credentials");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
}
