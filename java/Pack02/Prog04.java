package Pack02;

import org.testng.annotations.Test;

public class Prog04 {
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Testing Apple Phone One");
	}
	
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Testing Apple Phone Two");
	}
	
	@Test(groups = {"Vivo"})
	public void vivo1() {
		System.out.println("Testing Vivo Phone One");
	}
	
	@Test(groups = {"Vivo"})
	public void vivo2() {
		System.out.println("Testing Vivo Phone Two");
	}
	
	@Test(groups = {"Moto"})
	public void moto1() {
		System.out.println("Testing Moto Phone One");
	}
	
	@Test(groups = {"Moto"})
	public void moto2() {
		System.out.println("Testing Moto Phone Two");
	}
	
	@Test(groups = {"Lenovo"})
	public void lenovo1() {
		System.out.println("Testing Lenovo Phone One");
	}
	
	@Test(groups = {"Lenovo"})
	public void lenovo2() {
		System.out.println("Testing Lenovo Phone Two");
	}
}
