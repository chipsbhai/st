package projectDemo;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		String oldWindow = driver.getWindowHandle();
		System.out.println("Present Window Handle: "+oldWindow);
		
		WebElement firstButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		firstButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Window Handles: "+handles);
		for (String newWindow: handles) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\'email\']"));
		textBox.sendKeys("mcavit@gmail.com");
	}

}
