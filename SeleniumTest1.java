import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");
	    WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("OpenAI ChatGPT");
		searchBox.submit();
		
		System.out.println("search performed");
		
	}

}

