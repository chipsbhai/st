package Pack02;

import org.testng.annotations.Test;

public class Prog01 {
	@Test(groups = {"login"})
	public void FacultyLogin() {
		System.out.println("Faculty Login");
	}
	
	@Test
	public void FacultyDetails() {
		System.out.println("Faculty Details");
	}
}
