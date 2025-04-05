package projectDemo;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileDownloadExample1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement download = driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']"));
		download.click();
		Thread.sleep(5000);
		File fileLocation = new File("C:\\Users\\praka\\Downloads");
		File[] totalFiles = fileLocation.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File Download Success");
				break;
			}
		}
	}

}
