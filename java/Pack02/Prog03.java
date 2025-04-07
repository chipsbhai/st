package Pack02;

import org.testng.annotations.Test;

public class Prog03 {
	@Test(groups = {"login"})
	public void studentLogin() {
		System.out.println("Student Login");
	}
	
	@Test
	public void studentDetails() {
		System.out.println("Student Details");
	}
}
