import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;

public class AutoTypeSuggestions {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        try {
            WebElement accept = driver.findElement(By.xpath("//div[text()='I agree' or text()='Accept all']"));
            accept.click();
        } catch (Exception ignored) {}

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        try { Thread.sleep(3000); } catch (InterruptedException e) {}

        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

        System.out.println("Suggestions found: " + suggestions.size());

        for (WebElement suggestion : suggestions) {
            String text = suggestion.getText();
            System.out.println(text);

            if (text.equalsIgnoreCase("selenium interview questions")) {
                suggestion.click(); 
                break;            
            }
        }
        try { Thread.sleep(4000); } catch (InterruptedException e) {}
        
    }
}
