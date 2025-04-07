package Pack01;

import org.testng.annotations.Test;

public class Prog04 {
	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("Start the car");
	}
	
	@Test(priority = 1)
	public void swiftFirstGear() {
		System.out.println("First Gear");
	}
	
	@Test(priority = 2)
	public void swiftSecondGear() {
		System.out.println("Second Gear");
	}
	
	@Test(priority = 3)
	public void swiftThirdGear() {
		System.out.println("Third Gear");
	}
	
	@Test(priority = 4)
	public void swiftFourthGear() {
		System.out.println("Fourth Gear");
	}
}
