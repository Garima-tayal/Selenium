import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonXpathSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("laptop");

        WebElement searchButton = driver.findElement(By.xpath("//input[contains(@class,'nav-input')]"));
        searchButton.click();

        WebElement searchBoxAgain = driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
        System.out.println("Starts-with XPath ID: " + searchBoxAgain.getAttribute("id"));

        WebElement todayDeals = driver.findElement(By.xpath("//a[text()='Today’s Deals']"));
        System.out.println("Text XPath: " + todayDeals.getText());

        WebElement multiCondition = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @dir='auto']"));
        System.out.println("Multi Attribute: " + multiCondition.getAttribute("placeholder"));

    }
}
