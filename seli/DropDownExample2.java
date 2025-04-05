package projectDemo;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class DropDownExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
		if (dropdown.isEnabled() && dropdown.isDisplayed()) {
			System.out.println("Dropdown is enabled and visible");
		}
		else {
			System.out.println("Dropdown is not visible");
		}
		
		Select select = new Select(dropdown);
		if (select.isMultiple()) {
			System.out.println("Dropdown list accepts multiple choices");
		}
		else {
			System.out.println("Dropdown list does not accept multiple choices");
		}
		
		int listSize = select.getOptions().size();
		System.out.println("List size: "+listSize);
		
		select.selectByVisibleText("India");
		String getText = select.getFirstSelectedOption().getText();
		System.out.println("Option choosen: "+getText);
		driver.close();
	}

}
