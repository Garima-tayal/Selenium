import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonHtmlSelectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");


        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("headphones");

        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();

        try { Thread.sleep(2000); } catch (Exception e) {}

        WebElement dealsLink = driver.findElement(By.linkText("Today's Deals"));
        dealsLink.click();


        try { Thread.sleep(2000); } catch (Exception e) {}
    
    }
}
