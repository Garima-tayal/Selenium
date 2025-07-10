import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckboxAutomation {
public static void main(String[] args) {
        System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp");

        WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
 
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected!");
        } else {
            System.out.println("Checkbox is NOT selected.");
        }

        try { Thread.sleep(2000); } catch (InterruptedException e) {}
    }
}
