
package Pack01;

import org.testng.annotations.Test;

public class Prog07 {
	@Test(enabled = false)
	public void highSchool() {
		System.out.println("High School");
	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary");
	}

	@Test(dependsOnMethods = "higherSecondary")
	public void college() {
		System.out.println("College");
	}
}
