import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDown {
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(5000); 
        WebElement dropdown1 = driver.findElement(By.xpath("//option[@value='1']"));
        System.out.println("Dropdown 1 text: " + dropdown1.getText());
        dropdown1.click();
    }
}