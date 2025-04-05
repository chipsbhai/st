package projectDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class AlertExample3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url = "https://testpages.herokuapp.com/styled/alerts/alert-test.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		WebElement promptBox = driver.findElement(By.id("promptexample"));
		promptBox.click();
		Thread.sleep(5000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("HELLO");
		promptAlert.accept();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 250)");
	}

}
