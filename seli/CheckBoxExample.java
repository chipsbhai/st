package projectDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		WebElement basicOption = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]"));
		basicOption.click();
		WebElement ajaxOption = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/span"));
		boolean ajaxStatus = ajaxOption.isSelected();
		System.out.println("Ajax CheckBox Status is:"+ajaxStatus);
	}
}
