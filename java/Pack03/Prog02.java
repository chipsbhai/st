package Pack03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog02 {
	@Test
	public void test1() {
		Assert.assertEquals("MIT", "VIT");
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("MIT", "VIT", "Test to check title");
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(true, false, "Test to check login credentials 1.");
	}
	
	@Test
	public void test5() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test6() {
		Assert.assertTrue(false, "Test to check login credentials 2.");
	}
	
	@Test
	public void test7() {
		Assert.assertFalse(false);
	}
	
	@Test
	public void test8() {
		Assert.assertFalse(true, "Test to check login credentials 3.");
	}
}
