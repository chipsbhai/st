package projectDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		String URL = "https://www.facebook.com";
		driver.get(URL);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook - log in or sign up";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Verification is success");
			System.out.println("Home page title is: "+actualTitle);
		}
		else {
			System.out.println("Varification is failed, Match not found");
		}
		driver.close();
	}

}
