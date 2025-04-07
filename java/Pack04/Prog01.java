package Pack04;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prog01 {
	@Test
	@Parameters("Name")
	public void displayName(String Name) {
		System.out.println("Hello, " + Name);
	}
}
