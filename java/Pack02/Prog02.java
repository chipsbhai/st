package Pack02;

import org.testng.annotations.Test;

public class Prog02 {
	@Test(groups = {"login"})
	public void ParentLogin() {
		System.out.println("Parent Login");
	}
	
	@Test()
	public void ParentDetails() {
		System.out.println("Parent Details");
	}
}
