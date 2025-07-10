import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonCssSelector{
    public static void main(String[] args) {
        System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");

        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("laptop");

        WebElement searchButton = driver.findElement(By.cssSelector(".nav-input"));
        searchButton.click();

        WebElement searchBoxAgain = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("Placeholder: " + searchBoxAgain.getAttribute("placeholder"));

        WebElement multiAttr = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox'][dir='auto']"));
        System.out.println("Multi-Attr input value: " + multiAttr.getAttribute("value"));

        WebElement partialMatch = driver.findElement(By.cssSelector("input[id*='search']"));
        System.out.println("Contains (*): " + partialMatch.getAttribute("id"));

        WebElement startsWith = driver.findElement(By.cssSelector("input[id^='twotab']"));
        System.out.println("Starts with (^): " + startsWith.getAttribute("id"));

        WebElement endsWith = driver.findElement(By.cssSelector("input[id$='textbox']"));
        System.out.println("Ends with ($): " + endsWith.getAttribute("id"));

        System.out.println("Page title: " + driver.getTitle());
    }
}
