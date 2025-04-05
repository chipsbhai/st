package projectDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		String URL = "https://www.google.co.in";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		String getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL of Home page: "+getCurrentURL);
		String getPageSource = driver.getPageSource();
		System.out.println("Page source of current page: "+getPageSource);
		driver.close();
	}

}
