package projectDemo;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.google.co.in";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		System.out.println("Website launched successfully.");
		String getTitle = driver.getTitle();
		System.out.println("Title of home page: "+getTitle);
		driver.close();
	}

}
