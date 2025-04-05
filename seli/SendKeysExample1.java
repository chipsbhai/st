package projectDemo;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SendKeysExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		WebElement username1 = driver.findElement(By.name("username"));
		WebElement password1 = driver.findElement(By.name("password"));
		username1.sendKeys("Admin");
		password1.sendKeys("admin123");
		System.out.println("Text Field Values Set");	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		username1.sendKeys(Keys.CONTROL+"a");
		username1.sendKeys(Keys.DELETE);
		password1.sendKeys(Keys.CONTROL+"a");
		password1.sendKeys(Keys.DELETE);
		
		WebElement submit =driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		username1.sendKeys("Admin");
		password1.sendKeys("admin123");
		submit.click();
		System.out.println("Login Button Clicked");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ui/li/span/p")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ui/li/ul/li[4]/a")).click();
		
		
	}

}
