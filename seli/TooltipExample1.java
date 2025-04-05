package projectDemo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//*[@id=\'APjFqb\']"));
		@SuppressWarnings("deprecation")
		String toolTipText = name.getAttribute("title");
		System.out.println("Tool Tip Text: "+toolTipText);
	}

}
