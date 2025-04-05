package projectDemo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\'from:drag_content\']"));
		WebElement To = driver.findElement(By.xpath("//*[@id=\'from:drop_header\']"));
		
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		actions.dragAndDrop(From, To).build().perform();
		System.out.println("Successfully Droped");
	}

}
