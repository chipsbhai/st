package Pack03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog01 {
	String name =  "VIT";
	
	@Test
	public void checkEqual() {
		Assert.assertEquals(name, "VIT", "Name is not equal to VIT");
	}
}
