package Pack07;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prog01 {
	@Test
	public void openGoogle() {
		new ChromeDriver().get("https://www.google.com/");
	}
	
	@Test
	public void openUniversity() {
		new ChromeDriver().get("https://www.vit.ac.in/");
	}
	
	@Test
	public void openHRM() {
		new ChromeDriver().get("https://opensource-demo.orangehrmlive.com/");
	}
}
