package projectDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01eifibwzy1f5bvp5tuiwk09hd7788608.npde0");
		driver.manage().window().maximize();
		WebElement getPositionButton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point xyPoint = getPositionButton.getLocation();
		int xValue = xyPoint.getX();
		int yValue = xyPoint.getY();
		System.out.println("X value is:"+xValue+" Y value is:"+yValue);
		WebElement colourButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String colour = colourButton.getCssValue("background");
		System.out.println("Button colour is:"+colour);
		WebElement sizeButton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Button Hight is:"+height+" Button Width is:"+width);
	}
}
