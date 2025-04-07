package Pack04;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prog02 {
	@Test
	@Parameters({"username", "password"})
	public void sample1(String username, String password) {
		System.out.println("The username is: " + username);
		System.out.println("The password is: " + password);
	}
}
