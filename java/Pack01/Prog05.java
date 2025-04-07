package Pack01;

import org.testng.annotations.Test;

public class Prog05 {
	@Test(priority = -1)
	public void sample() {
		System.out.println("Test with a Negative priority");
	}

	@Test(priority = 20)
	public void sample1() {
		System.out.println("Test A with priority=20");
	}

	@Test(priority = 20)
	public void sample3() {
		System.out.println("Test B with priority=20");
	}

	@Test()
	public void sample5() {
		System.out.println("Test with default priority");
	}

	@Test(priority = 50)
	public void sample4() {
		System.out.println("Test with priority 50");
	}
}
